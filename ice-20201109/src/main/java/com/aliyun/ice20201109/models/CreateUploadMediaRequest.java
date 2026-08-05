// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadMediaRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: app-1000000.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The entity ID. You can call the CreateEntity operation to create an entity and customize the dynamic metadata structure.</p>
     * 
     * <strong>example:</strong>
     * <p>9e177cac2fb44f8b8c67b199fcc7bffd</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The file information in JSON format. This parameter contains the following fields:</p>
     * <ul>
     * <li>Type (required): the file type. Valid values: video, image, audio, text, and other.</li>
     * <li>Name (required): the file name without the file name extension.</li>
     * <li>Size (optional): the file size.</li>
     * <li>Ext (required): the file name extension.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;:\&quot;video\&quot;,\&quot;Name\&quot;:\&quot;test\&quot;,\&quot;Size\&quot;:108078336,\&quot;Ext\&quot;:\&quot;mp4\&quot;}</p>
     */
    @NameInMap("FileInfo")
    public String fileInfo;

    /**
     * <p>The metadata of the media asset to upload, in JSON format.</p>
     * <p>Title (required):</p>
     * <ul>
     * <li>The maximum length is 128 characters.</li>
     * <li>UTF-8 encoded.</li>
     * </ul>
     * <p>Description (optional):</p>
     * <ul>
     * <li>The maximum length is 1024 characters.</li>
     * <li>UTF-8 encoded.</li>
     * </ul>
     * <p>CateId (optional): the category ID.</p>
     * <p>Tags (optional): the tags.</p>
     * <p>BusinessType (required): the business type. Valid values:</p>
     * <ul>
     * <li>When Type = video:
     * opening: opening credits. ending: ending credits.</li>
     * <li>When Type = image:
     * default: default.
     * cover: cover image.</li>
     * <li>When Type = text:
     * subtitles: subtitles.
     * font: font.</li>
     * <li>When Type = material:
     * watermark: watermark.</li>
     * <li>general: general-purpose.</li>
     * </ul>
     * <p>CoverURL (optional): the cover URL.</p>
     * <p>DynamicMetaData: the dynamic metadata. The value is a string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Title\&quot;: \&quot;UploadTest\&quot;, \&quot;Description\&quot;: \&quot;UploadImageTest\&quot;, \&quot;Tags\&quot;: \&quot;tag1,tag2\&quot;,\&quot;BusinessType\&quot;:\&quot;cover\&quot;}</p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>Specifies the post-upload processing action when Type = video or audio.</p>
     * <p>ProcessType: set to Workflow.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter triggers an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous task</a>. After submission, the task is not immediately completed and enters a background queue for asynchronous execution.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ProcessType\&quot;:\&quot;Workflow\&quot;,\&quot;ProcessID\&quot;:\&quot;74ba870f1a4873a3ba238e0bf6fa9***\&quot;}</p>
     */
    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    /**
     * <p>The destination storage address.</p>
     * <ul>
     * <li>StorageType: only oss is supported.</li>
     * <li>StorageLocation: only VOD storage is supported. User-owned OSS storage is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;StorageType\&quot;:\&quot;oss\&quot;,\&quot;StorageLocation\&quot;:\&quot;outin-***.oss-cn-shanghai.aliyuncs.com\&quot;}</p>
     */
    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    /**
     * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateUploadMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaRequest self = new CreateUploadMediaRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadMediaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateUploadMediaRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateUploadMediaRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public CreateUploadMediaRequest setMediaMetaData(String mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
        return this;
    }
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    public CreateUploadMediaRequest setPostProcessConfig(String postProcessConfig) {
        this.postProcessConfig = postProcessConfig;
        return this;
    }
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    public CreateUploadMediaRequest setUploadTargetConfig(String uploadTargetConfig) {
        this.uploadTargetConfig = uploadTargetConfig;
        return this;
    }
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    public CreateUploadMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
