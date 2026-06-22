// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageToPDFTaskRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The message notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
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
     * <p>A list of input images. The images are converted in the order of their URIs in this list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateImageToPDFTaskRequestSources> sources;

    /**
     * <p>Custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The OSS address where the output PDF file is stored.</p>
     * <p>The address must be in the \<code>oss\\://${bucketname}/${objectname}\\</code> format. \<code>${bucketname}\\</code> must be an OSS bucket in the same region as the project. \<code>${objectname}\\</code> must be the path of the file, including the file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputDocument.pdf</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>Custom user information that is returned in the asynchronous notification message. This helps you associate the notification message with your system. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateImageToPDFTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageToPDFTaskRequest self = new CreateImageToPDFTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageToPDFTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateImageToPDFTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateImageToPDFTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageToPDFTaskRequest setSources(java.util.List<CreateImageToPDFTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateImageToPDFTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateImageToPDFTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateImageToPDFTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageToPDFTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateImageToPDFTaskRequestSources extends TeaModel {
        /**
         * <p>The rotation angle of the image in degrees. Valid values:</p>
         * <ul>
         * <li><p>0 (default)</p>
         * </li>
         * <li><p>90</p>
         * </li>
         * <li><p>180</p>
         * </li>
         * <li><p>270</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public Long rotate;

        /**
         * <p>The OSS address of the source image.</p>
         * <p>The address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}`\\` must be an OSS bucket in the same region as the project. \\</code>${Object}<code>\\</code> must be the full path of the file, including its file name extension.</p>
         * <p>Supported formats: JPG, JP2, PNG, TIFF, WebP, BMP, and SVG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/sampleobject.jpg</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateImageToPDFTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateImageToPDFTaskRequestSources self = new CreateImageToPDFTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateImageToPDFTaskRequestSources setRotate(Long rotate) {
            this.rotate = rotate;
            return this;
        }
        public Long getRotate() {
            return this.rotate;
        }

        public CreateImageToPDFTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
