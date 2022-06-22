// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateAdapterSettingOfAppRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WebFallbackMode")
    public Integer webFallbackMode;

    @NameInMap("WebRedirectUrl")
    public String webRedirectUrl;

    @NameInMap("WebRespContentType")
    public Integer webRespContentType;

    @NameInMap("WebRespMessage")
    public String webRespMessage;

    @NameInMap("WebRespStatusCode")
    public Integer webRespStatusCode;

    @NameInMap("WebUrlPrefixCleanItems")
    public String webUrlPrefixCleanItems;

    public static SentinelUpdateAdapterSettingOfAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateAdapterSettingOfAppRequest self = new SentinelUpdateAdapterSettingOfAppRequest();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateAdapterSettingOfAppRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setWebFallbackMode(Integer webFallbackMode) {
        this.webFallbackMode = webFallbackMode;
        return this;
    }
    public Integer getWebFallbackMode() {
        return this.webFallbackMode;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setWebRedirectUrl(String webRedirectUrl) {
        this.webRedirectUrl = webRedirectUrl;
        return this;
    }
    public String getWebRedirectUrl() {
        return this.webRedirectUrl;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setWebRespContentType(Integer webRespContentType) {
        this.webRespContentType = webRespContentType;
        return this;
    }
    public Integer getWebRespContentType() {
        return this.webRespContentType;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setWebRespMessage(String webRespMessage) {
        this.webRespMessage = webRespMessage;
        return this;
    }
    public String getWebRespMessage() {
        return this.webRespMessage;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setWebRespStatusCode(Integer webRespStatusCode) {
        this.webRespStatusCode = webRespStatusCode;
        return this;
    }
    public Integer getWebRespStatusCode() {
        return this.webRespStatusCode;
    }

    public SentinelUpdateAdapterSettingOfAppRequest setWebUrlPrefixCleanItems(String webUrlPrefixCleanItems) {
        this.webUrlPrefixCleanItems = webUrlPrefixCleanItems;
        return this;
    }
    public String getWebUrlPrefixCleanItems() {
        return this.webUrlPrefixCleanItems;
    }

}
