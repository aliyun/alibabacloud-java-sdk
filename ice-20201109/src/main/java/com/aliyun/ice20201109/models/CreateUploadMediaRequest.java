// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadMediaRequest extends TeaModel {
    /**
     * <p>The application ID. The default value is <code>app-1000000</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the entity. You can call the <code>CreateEntity</code> operation to create an entity and define a custom schema for dynamic metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>9e177cac2fb44f8b8c67b199fcc7bffd</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The file information, provided as a JSON string containing the following fields:</p>
     * <ul>
     * <li><p><code>Type</code> (Required): The file type. Valid values: <code>video</code>, <code>image</code>, <code>audio</code>, <code>text</code>, and <code>other</code>.</p>
     * </li>
     * <li><p><code>Name</code> (Required): The filename without the extension.</p>
     * </li>
     * <li><p><code>Size</code> (Optional): The file size.</p>
     * </li>
     * <li><p><code>Ext</code> (Required): The file extension.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;:\&quot;video\&quot;,\&quot;Name\&quot;:\&quot;test\&quot;,\&quot;Size\&quot;:108078336,\&quot;Ext\&quot;:\&quot;mp4\&quot;}</p>
     */
    @NameInMap("FileInfo")
    public String fileInfo;

    /**
     * <p>The media asset metadata, provided as a JSON string.</p>
     * <p><code>Title</code> (Required):</p>
     * <ul>
     * <li><p>The title can be up to 128 characters in length.</p>
     * </li>
     * <li><p>The title must be UTF-8 encoded.</p>
     * </li>
     * </ul>
     * <p><code>Description</code> (Optional):</p>
     * <ul>
     * <li><p>The description can be up to 1,024 characters in length.</p>
     * </li>
     * <li><p>The description must be UTF-8 encoded.</p>
     * </li>
     * </ul>
     * <p><code>CateId</code> (Optional): The category ID.</p>
     * <p><code>Tags</code> (Optional): The tags of the media asset, separated by commas.</p>
     * <p><code>BusinessType</code> (Required): The business type. Valid values depend on the <code>Type</code> specified in <code>FileInfo</code>.</p>
     * <ul>
     * <li><p>If <code>Type</code> is <code>video</code>: <code>opening</code> or <code>ending</code>.</p>
     * </li>
     * <li><p>If <code>Type</code> is <code>image</code>: <code>default</code>, <code>cover</code>, or <code>watermark</code>.</p>
     * </li>
     * <li><p>If <code>Type</code> is <code>text</code>: <code>subtitles</code> or <code>font</code>.</p>
     * </li>
     * <li></li>
     * <li><p>If <code>Type</code> is <code>other</code>: <code>general</code>.</p>
     * </li>
     * </ul>
     * <p><code>CoverURL</code> (Optional): The URL of the cover image.<br><code>DynamicMetaData</code> (Optional): A string for custom dynamic metadata.<br></p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Title\&quot;: \&quot;UploadTest\&quot;, \&quot;Description\&quot;: \&quot;UploadImageTest\&quot;, \&quot;Tags\&quot;: \&quot;tag1,tag2\&quot;,\&quot;BusinessType\&quot;:\&quot;cover\&quot;}</p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>The post-processing configuration for <code>video</code> or <code>audio</code> uploads.</p>
     * <p>Set <code>ProcessType</code> to <code>Workflow</code>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter specifies an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous task</a>, which is queued and runs in the background after you submit the request.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ProcessType\&quot;:\&quot;Workflow\&quot;,\&quot;ProcessID\&quot;:\&quot;74ba870f1a4873a3ba238e0bf6fa9***\&quot;}</p>
     */
    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    /**
     * <p>The destination storage configuration, provided as a JSON string.</p>
     * <ul>
     * <li><p><code>StorageType</code>: Only <code>oss</code> is supported.</p>
     * </li>
     * <li><p><code>StorageLocation</code>: Only VOD storage is supported. You cannot upload to your own OSS buckets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;StorageType\&quot;:\&quot;oss\&quot;,\&quot;StorageLocation\&quot;:\&quot;outin-***.oss-cn-shanghai.aliyuncs.com\&quot;}</p>
     */
    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    /**
     * <p>A JSON string for custom settings, such as configuring a message callback.</p>
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
