// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoRequest extends TeaModel {
    // 媒资Id
    @NameInMap("MediaId")
    public String mediaId;

    // 媒资媒体类型
    @NameInMap("InputURL")
    public String inputURL;

    // 媒资业务类型
    @NameInMap("BusinessType")
    public String businessType;

    // 标题
    @NameInMap("Title")
    public String title;

    // 描述
    @NameInMap("Description")
    public String description;

    // 分类
    @NameInMap("Category")
    public String category;

    // 标签,如果有多个标签用逗号隔开
    @NameInMap("MediaTags")
    public String mediaTags;

    // 封面图，仅视频媒资有效
    @NameInMap("CoverURL")
    public String coverURL;

    // 用户自定义元数据
    @NameInMap("DynamicMetaDataList")
    public String dynamicMetaDataList;

    // 用户数据，最大1024字节
    @NameInMap("UserData")
    public String userData;

    // 是否以append的形式更新Tags字段
    @NameInMap("AppendTags")
    public Boolean appendTags;

    // 是否以append的形式更新DynamicMetaDataList字段
    @NameInMap("AppendDynamicMeta")
    public Boolean appendDynamicMeta;

    public static UpdateMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoRequest self = new UpdateMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public UpdateMediaInfoRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateMediaInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateMediaInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMediaInfoRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateMediaInfoRequest setMediaTags(String mediaTags) {
        this.mediaTags = mediaTags;
        return this;
    }
    public String getMediaTags() {
        return this.mediaTags;
    }

    public UpdateMediaInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateMediaInfoRequest setDynamicMetaDataList(String dynamicMetaDataList) {
        this.dynamicMetaDataList = dynamicMetaDataList;
        return this;
    }
    public String getDynamicMetaDataList() {
        return this.dynamicMetaDataList;
    }

    public UpdateMediaInfoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public UpdateMediaInfoRequest setAppendTags(Boolean appendTags) {
        this.appendTags = appendTags;
        return this;
    }
    public Boolean getAppendTags() {
        return this.appendTags;
    }

    public UpdateMediaInfoRequest setAppendDynamicMeta(Boolean appendDynamicMeta) {
        this.appendDynamicMeta = appendDynamicMeta;
        return this;
    }
    public Boolean getAppendDynamicMeta() {
        return this.appendDynamicMeta;
    }

}
