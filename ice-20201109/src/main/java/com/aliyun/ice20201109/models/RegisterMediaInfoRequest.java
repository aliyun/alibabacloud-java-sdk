// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoRequest extends TeaModel {
    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <ul>
     * <li>subtitles</li>
     * <li>font</li>
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
     * <p>The client token. A 32-character UUID that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cover image URL.</p>
     * <ul>
     * <li><p>Maximum length: 128 bytes.</p>
     * </li>
     * <li><p>UTF-8 encoded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The content description.</p>
     * <ul>
     * <li><p>Maximum length: 1024 bytes.</p>
     * </li>
     * <li><p>UTF-8 encoded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defaultDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The URL of the media asset to be registered in the corresponding system. Once registered, this URL cannot be changed and is attached to the IMS mediaId.</p>
     * <ul>
     * <li>OSS URL. Two formats are supported:</li>
     * </ul>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     * <p>oss://example-bucket/example.mp4
     *  (This format assumes by default that the OSS region is the same as the service registration area.)</p>
     * <ul>
     * <li>VOD media asset:</li>
     * </ul>
     * <p>vod://\<em>\</em>\<em>20b48fb04483915d4f2cd8ac</em>***</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a>  or  vod://<strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The tags.</p>
     * <ul>
     * <li><p>Maximum number of tags: 16.</p>
     * </li>
     * <li><p>Separate multiple tags with commas.</p>
     * </li>
     * <li><p>Maximum length of a single tag: 32 bytes.</p>
     * </li>
     * <li><p>UTF-8 encoded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("MediaTags")
    public String mediaTags;

    /**
     * <p>The media type of the media asset. Valid values:</p>
     * <ul>
     * <li>image</li>
     * <li>video</li>
     * <li>audio</li>
     * <li>text</li>
     * </ul>
     * <p>When the value is &quot;text&quot;, the businessType must be set to &quot;subtitles&quot; or &quot;font&quot;.</p>
     * <p>Specify this field as needed. When the InputURL field is an OSS URL, the media type can also be automatically determined based on the file name extension (only for image, video, and audio file extensions). For the mapping between file extensions and media types, see <a href="https://help.aliyun.com/document_detail/466207.html">File formats</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Specifies whether to overwrite an existing registered media asset. Default value: false.</p>
     * <ul>
     * <li><p>true: If the inputUrl is already registered, the existing media asset is deleted and a new media asset is registered.</p>
     * </li>
     * <li><p>false: If the inputUrl is already registered, the new media asset is not registered. Duplicate inputUrl values are not supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_) are supported. The length must be 6 to 64 characters. The ID must be unique for each user.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The registration configuration.</p>
     * <p>By default, a sprite image is generated for the media asset. To disable this, set the NeedSprite field to false.</p>
     * <p>By default, a snapshot is generated. To disable this, set the NeedSnapshot field to false.</p>
     * <p>To specify the time for the cover image, configure CoverConfig, which contains the following field:</p>
     * <ul>
     * <li>StartTime: The time in seconds at which the cover image is captured from the media asset. Up to four decimal places are supported.</li>
     * </ul>
     * <p>After media asset registration, to import the media asset into a custom search library, configure SearchLibName. For information about how to create and use a custom search library, see <a href="~~2796619#dd34d8c740yj9~~">Use a custom search library</a>.</p>
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
     * <p>The intelligent tagging template. Valid values:</p>
     * <ul>
     * <li>S00000101-300080: A system template that includes NLP content understanding.</li>
     * <li>S00000103-000001: A system template that includes NLP content understanding and all <a href="~~2804526#93b27f536airj~~">tagging capabilities</a>.</li>
     * <li>S00000103-000002: A system template that includes all <a href="~~2804526#93b27f536airj~~">tagging capabilities</a> but does not include NLP content understanding.</li>
     * </ul>
     * <p>For more information about tagging capabilities, see the documentation.</p>
     * <p>After this field is configured, an intelligent tagging analysis task is automatically initiated upon media asset registration. For billing information, see <a href="https://help.aliyun.com/document_detail/600262.html">Billing of Smart Tag Standard Edition</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000101-300080</p>
     */
    @NameInMap("SmartTagTemplateId")
    public String smartTagTemplateId;

    /**
     * <p>The title. If not provided, a default title is automatically generated based on the date.</p>
     * <ul>
     * <li><p>Maximum length: 128 bytes.</p>
     * </li>
     * <li><p>UTF-8 encoded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defaultTitle</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user data. Custom callback URL configuration is supported. For configuration instructions, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
     * <ul>
     * <li><p>Maximum length: 1024 bytes.</p>
     * </li>
     * <li><p>UTF-8 encoded.</p>
     * </li>
     * <li><p>Json format.</p>
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
