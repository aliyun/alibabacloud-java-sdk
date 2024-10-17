// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoRequest extends TeaModel {
    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <ul>
     * <li>subtitles</li>
     * <li>watermark</li>
     * <li>opening</li>
     * <li>ending</li>
     * <li>general</li>
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
     * <li>The value can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
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
     * <li>The value can be up to 1,024 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
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
     * <li>OSS URL in one of the following formats:</li>
     * </ul>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     * <p>oss://example-bucket/example.mp4: In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</p>
     * <ul>
     * <li>URL of an ApsaraVideo VOD media asset</li>
     * </ul>
     * <p>vod://\<em>\</em>\<em>20b48fb04483915d4f2cd8ac\</em>\<em>\</em>\*</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The tags of the media asset.</p>
     * <ul>
     * <li>Up to 16 tags are supported.</li>
     * <li>Separate multiple tags with commas (,).</li>
     * <li>Each tag can be up to 32 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
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
     * <li>image</li>
     * <li>video</li>
     * <li>audio</li>
     * <li>text</li>
     * </ul>
     * <p>We recommend that you specify this parameter based on your business requirements. If you set InputURL to an OSS URL, the media asset type can be automatically determined based on the file name extension. For more information
     * &lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/document_detail/466207.html">File formats</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Specifies whether to overwrite the media asset that has been registered by using the same URL. Default value: false. Valid values:</p>
     * <p>\- true: If a media asset has been registered by using the same URL, the original media asset is deleted and the new media asset is registered.</p>
     * <p>\- false: If a media asset has been registered by using the same URL, the new media asset is not registered. A URL cannot be used to register multiple media assets.</p>
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
     *       &quot;NeedSprite&quot;: &quot;false&quot;
     * }</p>
     */
    @NameInMap("RegisterConfig")
    public String registerConfig;

    /**
     * <p>The ID of the smart tagging template. Valid values:</p>
     * <ul>
     * <li>S00000101-300080: the system template that supports natural language processing (NLP) for content recognition.</li>
     * <li>S00000103-000001: the system template that supports NLP for content recognition and all tagging capabilities.</li>
     * <li>S00000103-000002: the system template that supports all tagging capabilities but does not support NLP for content recognition.</li>
     * </ul>
     * <p>After you configure this parameter, a smart tag analysis task is automatically initiated after the media asset is registered. For more information about the billable items&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/zh/ims/media-ai-billing?spm=a2c4g.11186623.0.0.3147392dWwlSjL#p-k38-3rb-dug">Smart tagging</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000101-300080</p>
     */
    @NameInMap("SmartTagTemplateId")
    public String smartTagTemplateId;

    /**
     * <p>The title. If you do not specify this parameter, a default title is automatically generated based on the date.</p>
     * <ul>
     * <li>The value can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defaultTitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user data. You can specify a custom callback URL. For more information&lt;props=&quot;china&quot;&gt; ,see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
     * <ul>
     * <li>The value can be up to 1,024 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * <li>The value must be in the JSON format.</li>
     * </ul>
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
