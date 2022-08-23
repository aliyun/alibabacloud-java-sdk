// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApPortalConfigShrinkRequest extends TeaModel {
    @NameInMap("ApConfigId")
    public Long apConfigId;

    @NameInMap("AppAuthUrl")
    public String appAuthUrl;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSecret")
    public String authSecret;

    @NameInMap("CheckUrl")
    public String checkUrl;

    @NameInMap("ClientDownload")
    public Integer clientDownload;

    @NameInMap("ClientUpload")
    public Integer clientUpload;

    @NameInMap("Countdown")
    public Integer countdown;

    @NameInMap("Network")
    public Integer network;

    @NameInMap("PortalTypes")
    public String portalTypesShrink;

    @NameInMap("PortalUrl")
    public String portalUrl;

    @NameInMap("TimeStamp")
    public Long timeStamp;

    @NameInMap("TotalDownload")
    public Integer totalDownload;

    @NameInMap("TotalUpload")
    public Integer totalUpload;

    @NameInMap("WebAuthUrl")
    public String webAuthUrl;

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
