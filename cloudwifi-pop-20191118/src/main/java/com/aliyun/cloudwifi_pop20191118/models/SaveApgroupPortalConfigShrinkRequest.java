// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupPortalConfigShrinkRequest extends TeaModel {
    // appKey
    @NameInMap("AppName")
    public String appName;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // authKey
    @NameInMap("AuthKey")
    public String authKey;

    // totalDownload
    @NameInMap("TotalDownload")
    public Integer totalDownload;

    // apgroupId
    @NameInMap("ApgroupId")
    public Long apgroupId;

    // portalTypes
    @NameInMap("PortalTypes")
    public String portalTypesShrink;

    // clientUpload
    @NameInMap("ClientUpload")
    public Integer clientUpload;

    // countdown
    @NameInMap("Countdown")
    public Integer countdown;

    // whitelist
    @NameInMap("Whitelist")
    public String whitelist;

    // network
    @NameInMap("Network")
    public Integer network;

    // timeStamp
    @NameInMap("TimeStamp")
    public Long timeStamp;

    // appAuthUrl
    @NameInMap("AppAuthUrl")
    public String appAuthUrl;

    // totalUpload
    @NameInMap("TotalUpload")
    public Integer totalUpload;

    // authSecret
    @NameInMap("AuthSecret")
    public String authSecret;

    // webAuthUrl
    @NameInMap("WebAuthUrl")
    public String webAuthUrl;

    // portalUrl
    @NameInMap("PortalUrl")
    public String portalUrl;

    // clientDownload
    @NameInMap("ClientDownload")
    public Integer clientDownload;

    // checkUrl
    @NameInMap("CheckUrl")
    public String checkUrl;

    public static SaveApgroupPortalConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupPortalConfigShrinkRequest self = new SaveApgroupPortalConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveApgroupPortalConfigShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApgroupPortalConfigShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApgroupPortalConfigShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SaveApgroupPortalConfigShrinkRequest setTotalDownload(Integer totalDownload) {
        this.totalDownload = totalDownload;
        return this;
    }
    public Integer getTotalDownload() {
        return this.totalDownload;
    }

    public SaveApgroupPortalConfigShrinkRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public SaveApgroupPortalConfigShrinkRequest setPortalTypesShrink(String portalTypesShrink) {
        this.portalTypesShrink = portalTypesShrink;
        return this;
    }
    public String getPortalTypesShrink() {
        return this.portalTypesShrink;
    }

    public SaveApgroupPortalConfigShrinkRequest setClientUpload(Integer clientUpload) {
        this.clientUpload = clientUpload;
        return this;
    }
    public Integer getClientUpload() {
        return this.clientUpload;
    }

    public SaveApgroupPortalConfigShrinkRequest setCountdown(Integer countdown) {
        this.countdown = countdown;
        return this;
    }
    public Integer getCountdown() {
        return this.countdown;
    }

    public SaveApgroupPortalConfigShrinkRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

    public SaveApgroupPortalConfigShrinkRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApgroupPortalConfigShrinkRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public SaveApgroupPortalConfigShrinkRequest setAppAuthUrl(String appAuthUrl) {
        this.appAuthUrl = appAuthUrl;
        return this;
    }
    public String getAppAuthUrl() {
        return this.appAuthUrl;
    }

    public SaveApgroupPortalConfigShrinkRequest setTotalUpload(Integer totalUpload) {
        this.totalUpload = totalUpload;
        return this;
    }
    public Integer getTotalUpload() {
        return this.totalUpload;
    }

    public SaveApgroupPortalConfigShrinkRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApgroupPortalConfigShrinkRequest setWebAuthUrl(String webAuthUrl) {
        this.webAuthUrl = webAuthUrl;
        return this;
    }
    public String getWebAuthUrl() {
        return this.webAuthUrl;
    }

    public SaveApgroupPortalConfigShrinkRequest setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }
    public String getPortalUrl() {
        return this.portalUrl;
    }

    public SaveApgroupPortalConfigShrinkRequest setClientDownload(Integer clientDownload) {
        this.clientDownload = clientDownload;
        return this;
    }
    public Integer getClientDownload() {
        return this.clientDownload;
    }

    public SaveApgroupPortalConfigShrinkRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

}
