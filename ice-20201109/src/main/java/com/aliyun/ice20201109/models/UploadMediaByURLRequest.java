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
     * <p>The entity ID. You can call the CreateEntity operation to create an entity and specify a dynamic metadata structure.</p>
     * 
     * <strong>example:</strong>
     * <p>d67281da3c8743b8823ad12976187***</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The metadata of the media file that you want to upload. The value must be a JSON string.</p>
     * <ul>
     * <li>This parameter takes effect only if its value matches a URL that is specified in UploadURLs.</li>
     * <li>You must convert the JSON-formatted data, such as [UploadMetadata, UploadMetadata,…], into a JSON string.</li>
     * <li>For more information, see the &quot;UploadMetadata&quot; section of this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>The postprocessing configurations. You can specify this parameter if Type is set to video or audio.</p>
     * <p>Set ProcessType to Workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProcessType&quot;: &quot;Workflow&quot;,&quot;ProcessID&quot;:&quot;b72a06c6beeb4dcdb898feef067b1***&quot;}</p>
     */
    @NameInMap("PostProcessConfig")
    public String postProcessConfig;

    /**
     * <p>The destination storage address.</p>
     * <p>Set StorageType to oss.</p>
     * <p>Set StorageLocation to an address in ApsaraVideo VOD. You cannot set this field to an OSS URL.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;StorageType&quot;:&quot;oss&quot;,&quot;StorageLocation&quot;:&quot;outin-***.oss-cn-shanghai.aliyuncs.com&quot;}</p>
     */
    @NameInMap("UploadTargetConfig")
    public String uploadTargetConfig;

    /**
     * <p>The URL of the source file.</p>
     * <ul>
     * <li><p>The URL must contain a file name extension, such as mp4 in <code>https://****.mp4</code>.</p>
     * <ul>
     * <li>If the URL does not contain a file name extension, you can specify one by setting <code>FileExtension</code> in <code>UploadMetadata</code>.</li>
     * <li>If the URL contains a file name extension and <code>FileExtension</code> is also specified, the value of <code>FileExtension</code> prevails.</li>
     * </ul>
     * </li>
     * <li><p>URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.</p>
     * </li>
     * <li><p>Special characters may cause upload failures. Therefore, you must encode URLs before you separate them with commas (,).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://diffurl.mp4">https://diffurl.mp4</a></p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The user data. The value must be a JSON string. You can configure settings such as message callbacks.</p>
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
