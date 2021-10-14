// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApPortalConfigShrinkRequest extends TeaModel {
    // apConfigId
    @NameInMap("ApConfigId")
    public Long apConfigId;

    // appAuthUrl
    @NameInMap("AppAuthUrl")
    public String appAuthUrl;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // authKey
    @NameInMap("AuthKey")
    public String authKey;

    // authSecret
    @NameInMap("AuthSecret")
    public String authSecret;

    // checkUrl
    @NameInMap("CheckUrl")
    public String checkUrl;

    // clientDownload
    @NameInMap("ClientDownload")
    public Integer clientDownload;

    // clientUpload
    @NameInMap("ClientUpload")
    public Integer clientUpload;

    // countdown
    @NameInMap("Countdown")
    public Integer countdown;

    // network
    @NameInMap("Network")
    public Integer network;

    // portalTypes
    @NameInMap("PortalTypes")
    public String portalTypesShrink;

    // portalUrl
    @NameInMap("PortalUrl")
    public String portalUrl;

    // timeStamp
    @NameInMap("TimeStamp")
    public Long timeStamp;

    // totalDownload
    @NameInMap("TotalDownload")
    public Integer totalDownload;

    // totalUpload
    @NameInMap("TotalUpload")
    public Integer totalUpload;

    // webAuthUrl
    @NameInMap("WebAuthUrl")
    public String webAuthUrl;

    // whitelist
    @NameInMap("Whitelist")
    public String whitelist;

    public static SaveApPortalConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApPortalConfigShrinkRequest self = new SaveApPortalConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveApPortalConfigShrinkRequest setApConfigId(Long apConfigId) {
        this.apConfigId = apConfigId;
        return this;
    }
    public Long getApConfigId() {
        return this.apConfigId;
    }

    public SaveApPortalConfigShrinkRequest setAppAuthUrl(String appAuthUrl) {
        this.appAuthUrl = appAuthUrl;
        return this;
    }
    public String getAppAuthUrl() {
        return this.appAuthUrl;
    }

    public SaveApPortalConfigShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApPortalConfigShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApPortalConfigShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SaveApPortalConfigShrinkRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApPortalConfigShrinkRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public SaveApPortalConfigShrinkRequest setClientDownload(Integer clientDownload) {
        this.clientDownload = clientDownload;
        return this;
    }
    public Integer getClientDownload() {
        return this.clientDownload;
    }

    public SaveApPortalConfigShrinkRequest setClientUpload(Integer clientUpload) {
        this.clientUpload = clientUpload;
        return this;
    }
    public Integer getClientUpload() {
        return this.clientUpload;
    }

    public SaveApPortalConfigShrinkRequest setCountdown(Integer countdown) {
        this.countdown = countdown;
        return this;
    }
    public Integer getCountdown() {
        return this.countdown;
    }

    public SaveApPortalConfigShrinkRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApPortalConfigShrinkRequest setPortalTypesShrink(String portalTypesShrink) {
        this.portalTypesShrink = portalTypesShrink;
        return this;
    }
    public String getPortalTypesShrink() {
        return this.portalTypesShrink;
    }

    public SaveApPortalConfigShrinkRequest setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }
    public String getPortalUrl() {
        return this.portalUrl;
    }

    public SaveApPortalConfigShrinkRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public SaveApPortalConfigShrinkRequest setTotalDownload(Integer totalDownload) {
        this.totalDownload = totalDownload;
        return this;
    }
    public Integer getTotalDownload() {
        return this.totalDownload;
    }

    public SaveApPortalConfigShrinkRequest setTotalUpload(Integer totalUpload) {
        this.totalUpload = totalUpload;
        return this;
    }
    public Integer getTotalUpload() {
        return this.totalUpload;
    }

    public SaveApPortalConfigShrinkRequest setWebAuthUrl(String webAuthUrl) {
        this.webAuthUrl = webAuthUrl;
        return this;
    }
    public String getWebAuthUrl() {
        return this.webAuthUrl;
    }

    public SaveApPortalConfigShrinkRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
