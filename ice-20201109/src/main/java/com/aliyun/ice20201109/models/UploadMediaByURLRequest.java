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
     * <p>The entity ID. You can call the CreateEntity API to create an entity and define a custom dynamic metadata schema.</p>
     * 
     * <strong>example:</strong>
     * <p>d67281da3c8743b8823ad12976187***</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The metadata of the media file, provided as a JSON string.</p>
     * <ul>
     * <li><p>This metadata takes effect only when it matches a URL in <code>UploadURLs</code>.</p>
     * </li>
     * <li><p>The value must be a JSON array in the <code>[UploadMetadata, UploadMetadata, ...]</code> format, passed as a JSON string.</p>
     * </li>
     * <li><p>For more information, see the UploadMetadata table below.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>Specifies post-upload processing actions for media files of type <code>video</code> or <code>audio</code>.</p>
     * <p>The only supported value for <code>ProcessType</code> is <code>Workflow</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProcessType&quot;: &quot;Workflow&quot;,&quot;ProcessID&quot;:&quot;b72a06c6beeb4dcdb898feef067b1***&quot;}</p>
     */
    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    /**
     * <p>The destination storage location.</p>
     * <ul>
     * <li><p>The only valid value for <code>StorageType</code> is <code>oss</code>.</p>
     * </li>
     * <li><p><code>StorageLocation</code> supports VOD storage only and does not support your own OSS buckets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;StorageType&quot;:&quot;oss&quot;,&quot;StorageLocation&quot;:&quot;outin-***.oss-cn-shanghai.aliyuncs.com&quot;}</p>
     */
    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    /**
     * <p>The source URL of the media file.</p>
     * <ul>
     * <li><p>The URL must include a file extension. For example, in <code>https://****.mp4</code>, mp4 is the file extension.</p>
     * <ul>
     * <li><p>If the URL does not include a file extension, you can specify it by using the <code>FileExtension</code> parameter in <code>MediaMetaData</code>.</p>
     * </li>
     * <li><p>If a file extension is present in both the URL and the <code>FileExtension</code> parameter, the value of <code>FileExtension</code> takes precedence.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>The URLs must be URL-encoded. Separate multiple URLs with commas (,). You can specify up to 20 URLs.</p>
     * </li>
     * <li><p>To prevent upload failures due to special characters, URL-encode each URL before concatenating them with commas.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://diffurl.mp4">https://diffurl.mp4</a></p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>Custom settings, provided as a JSON string. This parameter supports configurations such as message callbacks.</p>
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
