// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApPortalConfigRequest extends TeaModel {
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
    public java.util.List<String> portalTypes;

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

    public static SaveApPortalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApPortalConfigRequest self = new SaveApPortalConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApPortalConfigRequest setApConfigId(Long apConfigId) {
        this.apConfigId = apConfigId;
        return this;
    }
    public Long getApConfigId() {
        return this.apConfigId;
    }

    public SaveApPortalConfigRequest setAppAuthUrl(String appAuthUrl) {
        this.appAuthUrl = appAuthUrl;
        return this;
    }
    public String getAppAuthUrl() {
        return this.appAuthUrl;
    }

    public SaveApPortalConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApPortalConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApPortalConfigRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SaveApPortalConfigRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApPortalConfigRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public SaveApPortalConfigRequest setClientDownload(Integer clientDownload) {
        this.clientDownload = clientDownload;
        return this;
    }
    public Integer getClientDownload() {
        return this.clientDownload;
    }

    public SaveApPortalConfigRequest setClientUpload(Integer clientUpload) {
        this.clientUpload = clientUpload;
        return this;
    }
    public Integer getClientUpload() {
        return this.clientUpload;
    }

    public SaveApPortalConfigRequest setCountdown(Integer countdown) {
        this.countdown = countdown;
        return this;
    }
    public Integer getCountdown() {
        return this.countdown;
    }

    public SaveApPortalConfigRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApPortalConfigRequest setPortalTypes(java.util.List<String> portalTypes) {
        this.portalTypes = portalTypes;
        return this;
    }
    public java.util.List<String> getPortalTypes() {
        return this.portalTypes;
    }

    public SaveApPortalConfigRequest setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }
    public String getPortalUrl() {
        return this.portalUrl;
    }

    public SaveApPortalConfigRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public SaveApPortalConfigRequest setTotalDownload(Integer totalDownload) {
        this.totalDownload = totalDownload;
        return this;
    }
    public Integer getTotalDownload() {
        return this.totalDownload;
    }

    public SaveApPortalConfigRequest setTotalUpload(Integer totalUpload) {
        this.totalUpload = totalUpload;
        return this;
    }
    public Integer getTotalUpload() {
        return this.totalUpload;
    }

    public SaveApPortalConfigRequest setWebAuthUrl(String webAuthUrl) {
        this.webAuthUrl = webAuthUrl;
        return this;
    }
    public String getWebAuthUrl() {
        return this.webAuthUrl;
    }

    public SaveApPortalConfigRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
