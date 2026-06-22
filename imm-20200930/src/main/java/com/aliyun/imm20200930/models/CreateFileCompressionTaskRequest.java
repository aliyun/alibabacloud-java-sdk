// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskRequest extends TeaModel {
    /**
     * <p>The compression format for file packaging.</p>
     * <blockquote>
     * <p>Currently, only the zip format is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zip</p>
     */
    @NameInMap("CompressedFormat")
    public String compressedFormat;

    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The message notification configuration. For more information, see the Notification data type. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     * <blockquote>
     * <p>IMM API callbacks do not currently support specifying a webhook address. Use MNS instead.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The address where the file manifest is stored. The file manifest stores the \<code>Sources\\</code> structure in JSON format on OSS. This is suitable for scenarios with many files to package.</p>
     * <blockquote>
     * <p>Specify either this parameter or <code>Sources</code>. In the manifest file, the <code>URI</code> parameter is required and the <code>Alias</code> parameter is optional. \<code>SourceManifestURI\\</code> supports up to 80,000 packaging rules.</p>
     * <blockquote>
     * <p>Warning: When you save the content to OSS, specify the OSS address of the file for this parameter.</p>
     * </blockquote>
     * </blockquote>
     * <p>The following is an example of the file structure:</p>
     * <pre><code>[{&quot;URI&quot;:&quot;oss://&lt;bucket&gt;/&lt;object&gt;&quot;, &quot;Alias&quot;:&quot;/new-dir/new-name&quot;}]
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.json</p>
     */
    @NameInMap("SourceManifestURI")
    public String sourceManifestURI;

    /**
     * <p>A list of files to package and their packaging rules.</p>
     * <blockquote>
     * <p>Specify either this parameter or \<code>SourceManifestURI\\</code>. \<code>Sources\\</code> supports a maximum of 100 packaging rules.</p>
     * <blockquote>
     * <p>Warning: If you have more than 100 packaging rules, use the \<code>SourceManifestURI\\</code> parameter.</p>
     * </blockquote>
     * </blockquote>
     */
    @NameInMap("Sources")
    public java.util.List<CreateFileCompressionTaskRequestSources> sources;

    /**
     * <p>The OSS address of the output file. The compressed file is named after the file name in this path, such as <code>name.zip</code>.</p>
     * <p>The OSS address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-target-object.zip</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>Custom user data. This data is returned in the asynchronous notification message, which helps you associate the notification with your internal system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
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
         * <p>Specifies a new path or name for the source file within the output compressed file.</p>
         * <ul>
         * <li><p>If you do not specify this parameter, the source directory structure is preserved. For example, if the source file is at <code>oss://test-bucket/test-dir/test-object.doc</code>, the path of the file in the compressed file is <code>/test-dir/test-object.doc</code>.</p>
         * </li>
         * <li><p>Rename the file. For example, if the source file is at <code>oss://test-bucket/test-object.jpg</code> and you set this parameter to <code>/test-rename-object.jpg</code>, the file in the compressed file is named <code>test-rename-object.jpg</code>.</p>
         * </li>
         * <li><p>Specify a new path for the source file in the compressed file. For example, if the source directory is <code>oss://test-bucket/test-dir/</code> and you set this parameter to <code>/new-dir/</code>, all files in the source directory are compressed into the <code>/new-dir/</code> path.</p>
         * </li>
         * <li><p>Set the value to <code>/</code> to remove the source directory structure. All files are placed directly in the root directory of the compressed file, and the original directory structure is not preserved.</p>
         * </li>
         * <li><p>Specify both a path and a file name. The file is renamed and moved to the specified path. For example, if you set this parameter to <code>/new-dir/alias.doc</code>, the file is renamed to <code>alias.doc</code> and placed in the <code>/new-dir/</code> path of the compressed file.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>Avoid creating files with duplicate names during the renaming process. If duplicate names exist, you may not be able to decompress the file in the compressed package. This depends on the decompression program you use.</p>
         * </li>
         * <li><p>Format requirement: The value must start with a forward slash (\<code>/\\</code>), such as <code>/new-dir/alias.doc</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/new-dir/</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The pattern matching mode for the packaging rule. Valid values include <code>prefix</code> (prefix matching) and <code>fullname</code> (exact matching). The default value is <code>prefix</code>.</p>
         * <ul>
         * <li><p><code>prefix</code>: In this mode, all files that match the prefix are packaged.</p>
         * </li>
         * <li><p><code>fullname</code>: In this mode, only the file that exactly matches the rule is packaged.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fullname</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The OSS address of the directory or file to package.</p>
         * <p>The OSS address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Object}\\</code> is described as follows:</p>
         * <ul>
         * <li><p>To package a directory, \<code>${Object}\\</code> is the directory name.</p>
         * </li>
         * <li><p>To package a file, \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
         * </li>
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
