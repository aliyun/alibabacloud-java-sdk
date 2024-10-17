// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoRequest extends TeaModel {
    /**
     * <p>Specifies whether to append tags. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: updates the MediaTags parameter by appending new tags.</li>
     * <li>false: updates the MediaTags parameter by overwriting existing tags with new tags.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AppendTags")
    public Boolean appendTags;

    /**
     * <p>The business type. Valid values:</p>
     * <ul>
     * <li>subtitles</li>
     * <li>watermark</li>
     * <li>opening</li>
     * <li>ending</li>
     * <li>general</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
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
     * <p>The category.</p>
     * <ul>
     * <li>The value can be up to 64 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defaultCategory</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The URL of the thumbnail.</p>
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
     * <p>The content description.</p>
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
     * <p>The input URL of the media asset in another service. The URL must be bound to the ID of the media asset in IMS. The URL cannot be modified once registered.</p>
     * <p>For a media asset from Object Storage Service (OSS), the URL may have one of the following formats:</p>
     * <p>1\. http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     * <p>2\. oss://example-bucket/example.mp4. This format indicates that the region in which the OSS bucket of the media asset resides is the same as the region in which OSS is activated.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The ID of the media asset. If this parameter is left empty, you must specify the input URL of the media asset, which has been registered in the IMS content library.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The tags.</p>
     * <ul>
     * <li>Up to 16 tags are supported.</li>
     * <li>Separate multiple tags with commas (,).</li>
     * <li>Each tag can be up to 32 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>updateTags1,updateTags2</p>
     */
    @NameInMap("MediaTags")
    public String mediaTags;

    /**
     * <p>The custom ID. The ID can be 6 to 64 characters in length and can contain only letters, digits, hyphens (-), and underscores (_). Make sure that the ID is unique among users.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The title.</p>
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
     * <p>The user data. It can be up to 1,024 bytes in size.</p>
     * 
     * <strong>example:</strong>
     * <p>userData</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoRequest self = new UpdateMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaInfoRequest setAppendTags(Boolean appendTags) {
        this.appendTags = appendTags;
        return this;
    }
    public Boolean getAppendTags() {
        return this.appendTags;
    }

    public UpdateMediaInfoRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateMediaInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateMediaInfoRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateMediaInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateMediaInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public UpdateMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaInfoRequest setMediaTags(String mediaTags) {
        this.mediaTags = mediaTags;
        return this;
    }
    public String getMediaTags() {
        return this.mediaTags;
    }

    public UpdateMediaInfoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
    }

    public UpdateMediaInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateMediaInfoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
