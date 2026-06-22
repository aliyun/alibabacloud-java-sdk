// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskShrinkRequest extends TeaModel {
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
    public String credentialConfigShrink;

    /**
     * <p>The message notification configuration. For more information, see the Notification data type. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     * <blockquote>
     * <p>IMM API callbacks do not currently support specifying a webhook address. Use MNS instead.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public String notificationShrink;

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
    public String sourcesShrink;

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
