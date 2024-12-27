// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskShrinkRequest extends TeaModel {
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
    public String credentialConfigShrink;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

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
    public String sourcesShrink;

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

    public static CreateFileCompressionTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileCompressionTaskShrinkRequest self = new CreateFileCompressionTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileCompressionTaskShrinkRequest setCompressedFormat(String compressedFormat) {
        this.compressedFormat = compressedFormat;
        return this;
    }
    public String getCompressedFormat() {
        return this.compressedFormat;
    }

    public CreateFileCompressionTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateFileCompressionTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateFileCompressionTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFileCompressionTaskShrinkRequest setSourceManifestURI(String sourceManifestURI) {
        this.sourceManifestURI = sourceManifestURI;
        return this;
    }
    public String getSourceManifestURI() {
        return this.sourceManifestURI;
    }

    public CreateFileCompressionTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateFileCompressionTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateFileCompressionTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
