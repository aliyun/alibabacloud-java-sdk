// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoRequest extends TeaModel {
    @NameInMap("AppendTags")
    public Boolean appendTags;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("Category")
    public String category;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("InputURL")
    public String inputURL;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaTags")
    public String mediaTags;

    @NameInMap("ReferenceId")
    public String referenceId;

    @NameInMap("Title")
    public String title;

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
