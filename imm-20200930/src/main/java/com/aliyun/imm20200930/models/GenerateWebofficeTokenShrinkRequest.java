// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable cached preview.</p>
     * <ul>
     * <li>true: When enabled, the document preview no longer updates collaborative editing content. This is suitable for preview-only scenarios.</li>
     * <li>false: When disabled, collaborative preview is used by default, which synchronizes collaborative editing content during preview.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Cached preview and non-cached preview have different unit prices. For more information, see the billing item description.
     * </notice>&gt;Notice: Cached preview does not support document content search or printing.</notice>
     * <notice>Cached preview does not support updating cached content.</notice>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CachePreview")
    public Boolean cachePreview;

    /**
     * <p><strong>Leave this parameter empty unless you have specific requirements.</strong></p>
     * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>Specifies whether uploading a file with the same name to OSS is expected behavior. Valid values:</p>
     * <ul>
     * <li>true: Uploading a file with the same name to OSS is expected behavior. The uploaded document overwrites the original document and generates a new version. After this parameter is set to true, you must first close the document that is being edited, wait about 5 minutes, and then reopen it to load the new document. The upload takes effect only when the document is closed. If the document is open, new saves overwrite the uploaded file.</li>
     * <li>false (default): Uploading a file with the same name to OSS is not expected behavior. The operation returns an error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    /**
     * <p>The file name, which must include the file name extension. The default value is the last segment of the <strong>SourceURI</strong> parameter.</p>
     * <p>Supported file name extensions (PDF supports preview only):</p>
     * <ul>
     * <li>Word documents: doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, and rtf</li>
     * <li>PowerPoint documents: ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, and dps</li>
     * <li>Excel documents: et, xls, xlt, xlsx, xlsm, xltx, xltm, and csv</li>
     * <li>PDF documents: pdf.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-Object.pptx</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>Specifies whether to hide the toolbar. This parameter is supported in document preview mode. Valid values:</p>
     * <ul>
     * <li><p>false (default): The toolbar is not hidden.</p>
     * </li>
     * <li><p>true: The toolbar is hidden.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    /**
     * <p>The notification configuration. Currently, only MNS is supported. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice message notification format</a>.</p>
     * <blockquote>
     * <p>Message notifications are sent when a file is saved or renamed.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>Sends event notifications to you as MNS messages. This parameter specifies the MNS topic for asynchronous message notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>test-topic</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <p>The password to open the document.</p>
     * <blockquote>
     * <p>Set this parameter if you want to preview or edit a password-protected document.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The user permission information in JSON format.</p>
     * <p>User permissions include the following options:</p>
     * <p>Each option is of the Boolean type. The default value is false. Valid values: true and false.</p>
     * <ul>
     * <li><p>Readonly (optional): Preview mode.</p>
     * </li>
     * <li><p>Rename (optional): The permission to rename a file. Only message notification is provided. The rename event is sent to MNS.</p>
     * </li>
     * <li><p>History (optional): The permission to view historical versions.</p>
     * </li>
     * <li><p>Copy (optional): The copy permission.</p>
     * </li>
     * <li><p>Export (optional): The permission to export to PDF.</p>
     * </li>
     * <li><p>Print (optional): The print permission.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>PDF supports only the preview feature. You must set the Readonly parameter to true.</p>
     * </blockquote>
     * <blockquote>
     * <p>PDF files do not support export.</p>
     * </blockquote>
     * <blockquote>
     * <p>To use the versioning feature, you must first enable versioning in OSS and then set the History parameter to true.</p>
     * <p>Notice: Printing is not supported in cached preview.
     * Notice: Historical versions can be viewed in edit mode but not in preview mode..</p>
     * </blockquote>
     */
    @NameInMap("Permission")
    public String permissionShrink;

    /**
     * <p>The maximum number of pages that can be previewed. By default, no limit is imposed. The maximum value is 5,000.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PreviewPages")
    public Long previewPages;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The OSS hotlink protection referer. Intelligent Media Management (IMM) needs to retrieve the source file from OSS. If hotlink protection is configured for OSS, IMM must pass the corresponding header to OSS to retrieve the source file.</p>
     * <blockquote>
     * <p>Set this parameter if the bucket that stores the document has a referer configured.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Referer")
    public String referer;

    /**
     * <p>The OSS URI of the document to preview or edit.</p>
     * <p>The OSS URI follows the format <code>oss://${Bucket}/${Object}</code>, where <code>Bucket</code> is the name of an OSS bucket in the same region as the current project, and <code>Object</code> is the full path of the file including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.docx</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The user information. You can pass in user information from the business side, and the WebOffice page displays this information.</p>
     * <p>The system distinguishes different users by User.Id. User.Name is used only for frontend display. If User.Id is not specified, the backend automatically generates a random ID. Users with different IDs are treated as different principals and cannot modify or delete each other\&quot;s comments.</p>
     * <p>The default format is: Unknown_RandomString. If User.Id is not specified, the user information is displayed as &quot;Unknown&quot; by default.</p>
     */
    @NameInMap("User")
    public String userShrink;

    /**
     * <p>The custom user data. This parameter takes effect only when the Notification parameter is specified with MNS configurations. The data is returned in asynchronous message notifications for you to associate and process message notifications within your system. Maximum length: 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;id&quot;: &quot;test-id&quot;,
     *       &quot;name&quot;: &quot;test-name&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The watermark information. The watermark is generated on the frontend and is not written to the source document. Different parameters passed for the same document produce different watermarks.</p>
     */
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
