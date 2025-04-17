// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable cache preview.</p>
     * <ul>
     * <li>true: enables cache preview. The document can be previewed only and cannot be collaboratively edited.</li>
     * <li>false: does not enable cache preview. The document can be collaboratively edited when it is being previewed.</li>
     * </ul>
     * <blockquote>
     * <p> The pricing for document previews varies based on whether cache preview is enabled or disabled.</p>
     * </blockquote>
     * <blockquote>
     * <p> During a cache preview, document content search and printing are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CachePreview")
    public Boolean cachePreview;

    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The configurations of authorization chains. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>Specifies whether to allow an upload of a document to the Object Storage Service (OSS) bucket. Valid values:</p>
     * <ul>
     * <li>true: Documents can be directly uploaded to OSS. The uploaded document overwrites the existing document and a new version is generated for the document. Before you upload a new document, close the existing document if it is being edited. After the document is uploaded, wait for approximately 5 minutes before you open the document again so that the new version can successfully load. Upload a new document only when the existing is closed. Otherwise, the uploaded document is overwritten when the existing document is saved.</li>
     * <li>false: Documents cannot be directly uploaded to OSS. If you try to upload a document, an error is returned. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    /**
     * <p>The name of the file. The extension must be included in the file name. By default, this parameter is set to the last depth level of the <strong>SourceURI</strong> parameter value.</p>
     * <p>Supported extensions (only preview supported for .pdf):</p>
     * <ul>
     * <li>Word documents: .doc, .docx, .txt, .dot, .wps, .wpt, .dotx, .docm, .dotm, and .rtf</li>
     * <li>Presentation documents: .ppt, .pptx, .pptm, .ppsx, .ppsm, .pps, .potx, .potm, .dpt, and .dps</li>
     * <li>Table documents: .et, .xls, .xlt, .xlsx, .xlsm, .xltx, .xltm, and .csv</li>
     * <li>PDF documents: .pdf</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test.pptx</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    /**
     * <p>The notification settings. Only SMQ messages are supported. For more information, see <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice message example</a>.</p>
     * <blockquote>
     * <p> A notification is sent after the document is saved or renamed.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <strong>example:</strong>
     * <p>topic1</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The user permission settings in the JSON format.</p>
     * <p>The parameter supports the following permission fields:</p>
     * <p>Each field is of type Boolean and can have a value of true and false (the default value):</p>
     * <ul>
     * <li>Readonly: grants the permission to preview the document. This field is optional.</li>
     * <li>Rename: grants the permission to rename the document. Notification messages of a rename event can be sent only by using SMQ. This field is optional.</li>
     * <li>History: grants the permission to view historical versions. This field is optional.</li>
     * <li>Copy: grants the permission to copy the document. This field is optional.</li>
     * <li>Export: grants the permission to export the document as a PDF file. This field is optional.</li>
     * <li>Print: grants the permission to print the document. This field is optional.</li>
     * </ul>
     * <blockquote>
     * <p> Only online preview is supported for PDF documents. When you call the operation on a PDF document, you can set Readonly only to true.</p>
     * </blockquote>
     * <blockquote>
     * <p> To manage multiple versions of the document, you must enable versioning for the bucket that stores the document and set the History parameter to true.</p>
     * </blockquote>
     * <blockquote>
     * <p> Printing is not supported during cache preview.</p>
     * </blockquote>
     */
    @NameInMap("Permission")
    public String permissionShrink;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PreviewPages")
    public Long previewPages;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Referer")
    public String referer;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/test.pptx</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The user information. The user information that you want to display on the WebOffice page. If you do not specify this parameter, the user name displayed is Unknown.</p>
     */
    @NameInMap("User")
    public String userShrink;

    /**
     * <p>The user-defined data that you want to return in asynchronous messages. This parameter takes effect only when you specify the MNS settings in the Notification parameter. The maximum length of the value is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;file_id&quot;: &quot;abc&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    @NameInMap("Watermark")
    public String watermarkShrink;

    public static GenerateWebofficeTokenShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebofficeTokenShrinkRequest self = new GenerateWebofficeTokenShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWebofficeTokenShrinkRequest setCachePreview(Boolean cachePreview) {
        this.cachePreview = cachePreview;
        return this;
    }
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    public GenerateWebofficeTokenShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GenerateWebofficeTokenShrinkRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GenerateWebofficeTokenShrinkRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GenerateWebofficeTokenShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GenerateWebofficeTokenShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateWebofficeTokenShrinkRequest setPermissionShrink(String permissionShrink) {
        this.permissionShrink = permissionShrink;
        return this;
    }
    public String getPermissionShrink() {
        return this.permissionShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GenerateWebofficeTokenShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateWebofficeTokenShrinkRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GenerateWebofficeTokenShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateWebofficeTokenShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

    public GenerateWebofficeTokenShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateWebofficeTokenShrinkRequest setWatermarkShrink(String watermarkShrink) {
        this.watermarkShrink = watermarkShrink;
        return this;
    }
    public String getWatermarkShrink() {
        return this.watermarkShrink;
    }

}
