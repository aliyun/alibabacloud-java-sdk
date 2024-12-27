// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskRequest extends TeaModel {
    /**
     * <p>The format of the package. Default value: zip.</p>
     * <blockquote>
     * <p> Only the ZIP format is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zip</p>
     */
    @NameInMap("CompressedFormat")
    public String compressedFormat;

    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The OSS URI of the inventory object that contains the objects to compress. The inventory object stores the objects to compress by using the same data structure of the Sources parameter in the JSON format. This parameter is suitable for specifying a large number of objects to compress.</p>
     * <blockquote>
     * <p> You must specify this parameter or the <code>Sources</code> parameter. The <code>URI</code> parameter is required and the <code>Alias</code> parameter is optional. You can specify up to 80,000 compression rule by using SourceManifestURI in one single call to the operation. The following line provides an example of the content within an inventory object.</p>
     * </blockquote>
     * <pre><code>[{&quot;URI&quot;:&quot;oss://&lt;bucket&gt;/&lt;object&gt;&quot;, &quot;Alias&quot;:&quot;/new-dir/new-name&quot;}]
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.json</p>
     */
    @NameInMap("SourceManifestURI")
    public String sourceManifestURI;

    /**
     * <p>The objects to be packed and packing rules.</p>
     * <blockquote>
     * <p> You must specify this parameter or the SourceManifestURI parameter. The Sources parameter can hold up to 100 packing rules. If you want to include more than 100 packing rules, use the SourceManifestURI parameter.</p>
     * </blockquote>
     */
    @NameInMap("Sources")
    public java.util.List<CreateFileCompressionTaskRequestSources> sources;

    /**
     * <p>The OSS URI of the package. The object name part in the URI is used as the name of the package. Example: <code>name.zip</code>.</p>
     * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-target-object.zip</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum length of the value is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateFileCompressionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileCompressionTaskRequest self = new CreateFileCompressionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileCompressionTaskRequest setCompressedFormat(String compressedFormat) {
        this.compressedFormat = compressedFormat;
        return this;
    }
    public String getCompressedFormat() {
        return this.compressedFormat;
    }

    public CreateFileCompressionTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateFileCompressionTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateFileCompressionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFileCompressionTaskRequest setSourceManifestURI(String sourceManifestURI) {
        this.sourceManifestURI = sourceManifestURI;
        return this;
    }
    public String getSourceManifestURI() {
        return this.sourceManifestURI;
    }

    public CreateFileCompressionTaskRequest setSources(java.util.List<CreateFileCompressionTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateFileCompressionTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateFileCompressionTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateFileCompressionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateFileCompressionTaskRequestSources extends TeaModel {
        /**
         * <p>Specifies the path of the object in the package, or renames the object in the package.</p>
         * <ul>
         * <li>Leave this parameter empty to retain the original directory structure of the object in the package. For example, if the object is stored at <code>oss://test-bucket/test-dir/test-object.doc</code> and you do not specify this parameter, the path of the object in the package is <code>/test-dir/test-object.doc</code>.</li>
         * <li>Rename the object. For example, if the object is stored at <code>oss://test-bucket/test-object.jpg</code> and you set the <strong>Alias</strong> parameter to <code>test-rename-object.jpg</code>, the name of the object in the package is <code>test-rename-object.jpg</code>.</li>
         * <li>Specify a different path for the object in the package. For example, if the directory to be packed is <code>oss://test-bucket/test-dir/</code> and you set the <strong>Alias</strong> parameter to <code>/new-dir/</code>, all objects in the directory are placed in the <code>/new-dir/</code> path in the package.</li>
         * <li>Set the parameter to <code>/</code> to remove the original directory structure.</li>
         * </ul>
         * <blockquote>
         * <p> Duplicate object names may cause a failure in extracting the objects from the package, depending on the packing tool that you use. We recommend that you avoid using duplicate object names when you rename objects in the packing task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/new-dir/</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The object matching rule. Valid values: <code>fullname</code> and <code>prefix</code>. Default value: <code>prefix</code></p>
         * <ul>
         * <li><code>prefix</code>: matches objects by object name prefix.</li>
         * <li><code>fullname</code>: exactly matches one single object by its full object name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fullname</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The OSS URI of the object or directory.</p>
         * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is a directory or object:</p>
         * <p>When you pack a directory, <code>${Object}</code> is the path of the directory.</p>
         * <ul>
         * <li>When you pack an object, <code>${Object}</code> is the path of the object with the extension included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateFileCompressionTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateFileCompressionTaskRequestSources self = new CreateFileCompressionTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateFileCompressionTaskRequestSources setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateFileCompressionTaskRequestSources setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateFileCompressionTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
