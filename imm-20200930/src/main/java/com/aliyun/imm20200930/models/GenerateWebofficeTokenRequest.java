// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenRequest extends TeaModel {
    /**
     * <p>Cache preview flag: </p>
     * <ul>
     * <li>true: When enabled, the document preview will no longer update collaborative editing content, suitable for scenarios where only preview is needed. </li>
     * <li>false: When disabled, it defaults to collaborative preview, allowing the preview to synchronously update collaborative editing content.<blockquote>
     * <p>Notice: The price for cache preview and non-cache preview differs. Please refer to the billing item description for more details.</notice> &gt;Notice: Search and print functions are not supported during cache preview.</notice> <notice>Updating cached content is currently not supported in cache preview mode.</notice></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true、false</p>
     */
    @NameInMap("CachePreview")
    public Boolean cachePreview;

    /**
     * <p><strong>If there are no special requirements, leave this blank.</strong></p>
     * <p>Chained authorization configuration, not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Using Chained Authorization to Access Other Entity Resources</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>Indicates whether uploading a file with the same name to OSS is an expected behavior. Possible values are as follows:</p>
     * <ul>
     * <li>true: Uploading a file with the same name to OSS is an expected behavior. The uploaded document will overwrite the original document and generate a new version. After setting it to true, you still need to close the currently editing document and wait for about 5 minutes before reopening it to load the new document. The upload is only effective when the document is closed; if the document is open, the new save will overwrite the uploaded file.</li>
     * <li>false (default): Uploading a file with the same name to OSS is not an expected behavior, and the interface will return an error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    /**
     * <p>Filename, which must include the file extension. By default, it is the last segment of the <strong>SourceURI</strong> parameter.
     * Supported file extensions (PDF is only supported for preview):</p>
     * <ul>
     * <li>Text documents (Word): doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, rtf </li>
     * <li>Presentation documents (PPT): ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, dps - Spreadsheet documents (Excel): et, xls, xlt, xlsx, xlsm, xltx, xltm, csv </li>
     * <li>PDF documents: pdf</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-Object.pptx</p>
     */
    @NameInMap("Filename")
    public String filename;

    /**
     * <p>Whether to hide the toolbar. This parameter can be set in document preview mode. Possible values are as follows:</p>
     * <ul>
     * <li>false (default): Do not hide the toolbar.</li>
     * <li>true: Hide the toolbar.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    /**
     * <p>Notification message configuration, currently supporting only MNS. For the asynchronous notification message format, refer to <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice Message Notification Format</a>.</p>
     * <blockquote>
     * <p>There will be message notifications when the file is saved or renamed.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>Supports notifying some events to customers via MNS messages. This parameter is the topic for MNS asynchronous message notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>test-topic</p>
     */
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    /**
     * <p>The password to open the document.</p>
     * <blockquote>
     * <p>If you need to preview or edit a password-protected document, set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>User permission information, represented in JSON format.</p>
     * <p>User permissions include the following options:</p>
     * <p>Each option is of type Boolean, with a default value of false, and can be set to true or false.</p>
     * <ul>
     * <li>Readonly (optional): Preview mode.</li>
     * <li>Rename (optional): File renaming permission, which only provides message notification functionality. The renaming event will be sent to MNS.</li>
     * <li>History (optional): Permission to view historical versions.</li>
     * <li>Copy (optional): Copy permission.</li>
     * <li>Export (optional): PDF export permission.</li>
     * <li>Print (optional): Print permission.</li>
     * </ul>
     * <blockquote>
     * <p>PDF only supports preview functionality, so the &quot;Readonly&quot; parameter must be set to true.</p>
     * <p>PDF files do not support exporting.</p>
     * <p>To use the multi-version feature, you must first enable the multi-version feature in OSS and then set the &quot;History&quot; parameter to true.</p>
     * <p>Notice: Printing is not supported in cached preview.
     * Notice: Historical versions can be viewed in edit mode but not in preview mode.</p>
     * </blockquote>
     */
    @NameInMap("Permission")
    public WebofficePermission permission;

    /**
     * <p>Limits the number of pages that can be previewed. By default, there is no limit. The maximum cannot exceed 5000.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PreviewPages")
    public Long previewPages;

    /**
     * <p>Project name, for how to obtain it, please refer to <a href="https://help.aliyun.com/document_detail/478153.html">Create Project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>OSS anti-leeching. IMM needs to obtain the source file from OSS. If OSS has set up anti-leeching, IMM must pass the corresponding header to OSS to get the source file.</p>
     * <blockquote>
     * <p>If the Bucket where the document is located has Referer set, please configure this parameter.</p>
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
     * <p>OSS address of the document to be previewed or edited. The OSS address follows the rule <code>oss://${Bucket}/${Object}</code>, where <code>Bucket</code> is the name of the OSS Bucket in the same region as the current project, and <code>Object</code> is the full path of the file including the file extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.docx</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>User information. You can pass in user information from the business side, which will be displayed on the WebOffice page.</p>
     * <p>The system distinguishes different users by User.Id, and User.Name is used only for front-end display. If User.Id is not provided, the backend will generate a random ID. Users with different IDs are considered different entities and cannot modify or delete each other\&quot;s comments.</p>
     * <p>The default format is: Unknown_random string. If User.Id is not provided, the user information will default to &quot;Unknown&quot;.</p>
     */
    @NameInMap("User")
    public WebofficeUser user;

    /**
     * <p>User-defined information. It only takes effect when Notification parameters are filled in for MNS configuration. It will be returned in asynchronous message notifications, which can help you correlate and process messages within your system. The maximum length is 2048 bytes.</p>
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
     * <p>Watermark information. The watermark is generated on the front end and is not written into the source document. The same document with different parameters will result in different watermarks.</p>
     */
    @NameInMap("Watermark")
    public WebofficeWatermark watermark;

    public static GenerateWebofficeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebofficeTokenRequest self = new GenerateWebofficeTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWebofficeTokenRequest setCachePreview(Boolean cachePreview) {
        this.cachePreview = cachePreview;
        return this;
    }
    public Boolean getCachePreview() {
        return this.cachePreview;
    }

    public GenerateWebofficeTokenRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GenerateWebofficeTokenRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GenerateWebofficeTokenRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GenerateWebofficeTokenRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GenerateWebofficeTokenRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public GenerateWebofficeTokenRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GenerateWebofficeTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateWebofficeTokenRequest setPermission(WebofficePermission permission) {
        this.permission = permission;
        return this;
    }
    public WebofficePermission getPermission() {
        return this.permission;
    }

    public GenerateWebofficeTokenRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GenerateWebofficeTokenRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateWebofficeTokenRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GenerateWebofficeTokenRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateWebofficeTokenRequest setUser(WebofficeUser user) {
        this.user = user;
        return this;
    }
    public WebofficeUser getUser() {
        return this.user;
    }

    public GenerateWebofficeTokenRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateWebofficeTokenRequest setWatermark(WebofficeWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

}
