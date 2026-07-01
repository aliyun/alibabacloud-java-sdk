// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoRequest extends TeaModel {
    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <ul>
     * <li><p>subtitles</p>
     * </li>
     * <li><p>watermark</p>
     * </li>
     * <li><p>opening</p>
     * </li>
     * <li><p>ending</p>
     * </li>
     * <li><p>general</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>opening</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3048</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The value must be a UUID that contains 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The thumbnail URL of the media asset.</p>
     * <ul>
     * <li><p>The value can be up to 128 bytes in length.</p>
     * </li>
     * <li><p>The value must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the media asset.</p>
     * <ul>
     * <li><p>The value can be up to 1,024 bytes in length.</p>
     * </li>
     * <li><p>The value must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defaultDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The URL of the media asset in another service. The URL is associated with the ID of the media asset in IMS. The URL cannot be modified once registered. The following types of URLs are supported:</p>
     * <ul>
     * <li><p>OSS URL in one of the following formats:</p>
     * <ul>
     * <li><p><code>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</code></p>
     * </li>
     * <li><p><code>oss://example-bucket/example.mp4</code>: In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>URL of an ApsaraVideo VOD media asset</p>
     * <p><code>vod://***20b48fb04483915d4f2cd8ac****</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a>  or  vod://<strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The tags of the media asset.</p>
     * <ul>
     * <li><p>Up to 16 tags are supported.</p>
     * </li>
     * <li><p>Separate multiple tags with commas (,).</p>
     * </li>
     * <li><p>Each tag can be up to 32 bytes in length.</p>
     * </li>
     * <li><p>The value must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("MediaTags")
    public String mediaTags;

    /**
     * <p>The type of the media asset. Valid values:</p>
     * <ul>
     * <li><p>image</p>
     * </li>
     * <li><p>video</p>
     * </li>
     * <li><p>audio</p>
     * </li>
     * <li><p>text</p>
     * </li>
     * </ul>
     * <p>We recommend that you specify this parameter based on your business requirements. If you set InputURL to an OSS URL, the media asset type can be automatically determined based on the file name extension. Refer to <a href="t2240981.xdita#"></a>for details.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Specifies whether to overwrite the media asset that has been registered by using the same URL. Default value: false. Valid values:</p>
     * <ul>
     * <li><p>true: If a media asset has been registered by using the same URL, the original media asset is deleted and the new media asset is registered.</p>
     * </li>
     * <li><p>false: If a media asset has been registered by using the same URL, the new media asset is not registered. A URL cannot be used to register multiple media assets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The custom ID. The ID can be 6 to 64 characters in length and can contain only letters, digits, hyphens (-), and underscores (_). Make sure that the ID is unique among users.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The registration configurations.</p>
     * <p>By default, a sprite is generated for the media asset. You can set NeedSprite to false to disable automatic sprite generation.</p>
     * <p>By default, a snapshot is generated for the media asset. You can set NeedSnapshot to false to disable automatic snapshot generation.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;NeedSprite&quot;: &quot;false&quot;,
     *     &quot;CoverConfig&quot;: {
     *         &quot;StartTime&quot;: 1.0
     *     },
     *        &quot;SearchLibName&quot;: &quot;test&quot;
     * }</p>
     */
    @NameInMap("RegisterConfig")
    public String registerConfig;

    /**
     * <p>The ID of the smart tagging template. Valid values:</p>
     * <ul>
     * <li><p>S00000101-300080: the system template that supports natural language processing (NLP) for content recognition.</p>
     * </li>
     * <li><p>S00000103-000001: the system template that supports NLP for content recognition and all <a href="t2729541.xdita#93b27f536airj">tagging capabilities</a>.</p>
     * </li>
     * <li><p>S00000103-000002: the system template that supports all <a href="t2729541.xdita#93b27f536airj">tagging capabilities</a> but does not support NLP for content recognition.</p>
     * </li>
     * </ul>
     * <p>After you configure this parameter, a smart tag analysis task is automatically initiated after the media asset is registered.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000101-300080</p>
     */
    @NameInMap("SmartTagTemplateId")
    public String smartTagTemplateId;

    /**
     * <p>The title. If you do not specify this parameter, a default title is automatically generated based on the date.</p>
     * <ul>
     * <li><p>The value can be up to 128 bytes in length.</p>
     * </li>
     * <li><p>The value must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defaultTitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user data. You can specify a custom callback URL. For more information, see <a href="t2243473.xdita#"></a>.</p>
     * <ul>
     * <li><p>The value can be up to 1,024 bytes in length.</p>
     * </li>
     * <li><p>The value must be encoded in UTF-8.</p>
     * </li>
     * <li><p>The value must be in the JSON format.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or{&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workflow ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>b4fb044839815d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static RegisterMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaInfoRequest self = new RegisterMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMediaInfoRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public RegisterMediaInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public RegisterMediaInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterMediaInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public RegisterMediaInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegisterMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public RegisterMediaInfoRequest setMediaTags(String mediaTags) {
        this.mediaTags = mediaTags;
        return this;
    }
    public String getMediaTags() {
        return this.mediaTags;
    }

    public RegisterMediaInfoRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public RegisterMediaInfoRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public RegisterMediaInfoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
    }

    public RegisterMediaInfoRequest setRegisterConfig(String registerConfig) {
        this.registerConfig = registerConfig;
        return this;
    }
    public String getRegisterConfig() {
        return this.registerConfig;
    }

    public RegisterMediaInfoRequest setSmartTagTemplateId(String smartTagTemplateId) {
        this.smartTagTemplateId = smartTagTemplateId;
        return this;
    }
    public String getSmartTagTemplateId() {
        return this.smartTagTemplateId;
    }

    public RegisterMediaInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public RegisterMediaInfoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RegisterMediaInfoRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
