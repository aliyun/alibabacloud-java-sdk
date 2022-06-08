// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoRequest extends TeaModel {
    // 媒资业务类型
    @NameInMap("BusinessType")
    public String businessType;

    // 分类
    @NameInMap("Category")
    public String category;

    // 客户端token
    @NameInMap("ClientToken")
    public String clientToken;

    // 封面图，仅视频媒资有效
    @NameInMap("CoverURL")
    public String coverURL;

    // 描述
    @NameInMap("Description")
    public String description;

    // 用户自定义元数据
    @NameInMap("DynamicMetaDataList")
    public String dynamicMetaDataList;

    // 媒资媒体url
    @NameInMap("InputURL")
    public String inputURL;

    // 标签,如果有多个标签用逗号隔开
    @NameInMap("MediaTags")
    public String mediaTags;

    // 媒资媒体类型
    @NameInMap("MediaType")
    public String mediaType;

    // 是否覆盖已有媒资
    @NameInMap("Overwrite")
    public Boolean overwrite;

    // 注册媒资的配置
    @NameInMap("RegisterConfig")
    public String registerConfig;

    // 标题
    @NameInMap("Title")
    public String title;

    // 用户数据，最大1024字节
    @NameInMap("UserData")
    public String userData;

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

    public RegisterMediaInfoRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
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

    public RegisterMediaInfoRequest setDynamicMetaDataList(String dynamicMetaDataList) {
        this.dynamicMetaDataList = dynamicMetaDataList;
        return this;
    }
    public String getDynamicMetaDataList() {
        return this.dynamicMetaDataList;
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

    public RegisterMediaInfoRequest setRegisterConfig(String registerConfig) {
        this.registerConfig = registerConfig;
        return this;
    }
    public String getRegisterConfig() {
        return this.registerConfig;
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

}
