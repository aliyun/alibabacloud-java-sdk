// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The entity ID. You can call the CreateEntity operation to create an entity and define a custom dynamic metadata structure.</p>
     * 
     * <strong>example:</strong>
     * <p>d67281da3c8743b8823ad12976187***</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The metadata of the media file to be uploaded. The value is a JSON string.</p>
     * <ul>
     * <li>The metadata takes effect only when it matches a URL in UploadURLs.</li>
     * <li>JSON format: [UploadMetadata, UploadMetadata, ...]. The value must be converted to a JSON string.</li>
     * <li>For more information, see the UploadMetadata table below.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>The post-upload processing action when Type is set to video or audio.</p>
     * <p>Valid values of ProcessType: Workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProcessType&quot;: &quot;Workflow&quot;,&quot;ProcessID&quot;:&quot;b72a06c6beeb4dcdb898feef067b1***&quot;}</p>
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
     * <p>{&quot;StorageType&quot;:&quot;oss&quot;,&quot;StorageLocation&quot;:&quot;outin-***.oss-cn-shanghai.aliyuncs.com&quot;}</p>
     */
    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    /**
     * <p>The URL of the media source file.</p>
     * <ul>
     * <li>The URL must include a file name extension. For example, mp4 is the file name extension in <code>https://****.mp4</code>.<ul>
     * <li>If the URL does not include a file name extension, you can specify the FileExtension parameter in <code>UploadMetadatas</code>.</li>
     * <li>If the URL includes a file name extension and the FileExtension parameter is also specified, the value of FileExtension takes precedence.</li>
     * </ul>
     * </li>
     * <li>URL-encode the URLs. Separate multiple URLs with commas (,). A maximum of 20 URLs are supported.</li>
     * <li>To prevent upload failures caused by special characters, URL-encode each URL before concatenating them with commas.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://diffurl.mp4">https://diffurl.mp4</a></p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UploadMediaByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLRequest self = new UploadMediaByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadMediaByURLRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public UploadMediaByURLRequest setMediaMetaData(String mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
        return this;
    }
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    public UploadMediaByURLRequest setPostProcessConfig(String postProcessConfig) {
        this.postProcessConfig = postProcessConfig;
        return this;
    }
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    public UploadMediaByURLRequest setUploadTargetConfig(String uploadTargetConfig) {
        this.uploadTargetConfig = uploadTargetConfig;
        return this;
    }
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    public UploadMediaByURLRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    public UploadMediaByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
