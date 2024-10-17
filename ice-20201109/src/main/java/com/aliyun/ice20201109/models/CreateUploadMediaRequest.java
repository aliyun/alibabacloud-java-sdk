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
     * <p>The entity ID. You can call the CreateEntity operation to create an entity and specify a dynamic metadata structure.</p>
     * 
     * <strong>example:</strong>
     * <p>9e177cac2fb44f8b8c67b199fcc7bffd</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The file information, which is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li>Type: required. The file type. Valid values: video, image, audio, text, and other.</li>
     * <li>Name: required. The file name without the extension.</li>
     * <li>Size: optional. The file size.</li>
     * <li>Ext: required. The file name extension.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;:\&quot;video\&quot;,\&quot;Name\&quot;:\&quot;test.mp4\&quot;,\&quot;Size\&quot;:108078336,\&quot;Ext\&quot;:\&quot;mp4\&quot;}</p>
     */
    @NameInMap("FileInfo")
    public String fileInfo;

    /**
     * <p>The metadata of the media asset, which is a JSON string that contains the following fields:</p>
     * <p>Title: required.</p>
     * <ul>
     * <li>The value can be up to 128 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <p>Description: optional.</p>
     * <ul>
     * <li>The value can be up to 1,024 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <p>CateId: optional.</p>
     * <p>Tags: optional.</p>
     * <p>BusinessType: required. Valid values:</p>
     * <ul>
     * <li>opening or ending if Type is set to video</li>
     * <li>default or cover if Type is set to image</li>
     * <li>subtitles or font if Type is set to text</li>
     * <li>watermark if Type is set to material</li>
     * <li>general CoverURL: optional.</li>
     * </ul>
     * <p>DynamicMetaData: The value is a string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Title\&quot;: \&quot;UploadTest\&quot;, \&quot;Description\&quot;: \&quot;UploadImageTest\&quot;, \&quot;Tags\&quot;: \&quot;tag1,tag2\&quot;,\&quot;BusinessType\&quot;:\&quot;cover\&quot;}</p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>The postprocessing configurations. You can specify this parameter if Type is set to video or audio.</p>
     * <p>Set ProcessType to Workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;ProcessType\&quot;:\&quot;Workflow\&quot;,\&quot;ProcessID\&quot;:\&quot;74ba870f1a4873a3ba238e0bf6fa9***\&quot;}</p>
     */
    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    /**
     * <p>The destination storage address.</p>
     * <p>Set StorageType to oss.</p>
     * <p>Set StorageLocation to an address in ApsaraVideo VOD. You cannot set this field to an OSS URL.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;StorageType\&quot;:\&quot;oss\&quot;,\&quot;StorageLocation\&quot;:\&quot;outin-***.oss-cn-shanghai.aliyuncs.com\&quot;}</p>
     */
    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    /**
     * <p>The user data. The value must be a JSON string. You can configure settings such as message callbacks.</p>
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
