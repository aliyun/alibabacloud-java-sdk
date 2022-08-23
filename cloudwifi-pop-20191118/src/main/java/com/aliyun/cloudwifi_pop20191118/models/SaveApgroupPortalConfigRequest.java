// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupPortalConfigRequest extends TeaModel {
    @NameInMap("ApgroupId")
    public Long apgroupId;

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

    public static SaveApgroupPortalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupPortalConfigRequest self = new SaveApgroupPortalConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApgroupPortalConfigRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public SaveApgroupPortalConfigRequest setAppAuthUrl(String appAuthUrl) {
        this.appAuthUrl = appAuthUrl;
        return this;
    }
    public String getAppAuthUrl() {
        return this.appAuthUrl;
    }

    public SaveApgroupPortalConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApgroupPortalConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApgroupPortalConfigRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SaveApgroupPortalConfigRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApgroupPortalConfigRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public SaveApgroupPortalConfigRequest setClientDownload(Integer clientDownload) {
        this.clientDownload = clientDownload;
        return this;
    }
    public Integer getClientDownload() {
        return this.clientDownload;
    }

    public SaveApgroupPortalConfigRequest setClientUpload(Integer clientUpload) {
        this.clientUpload = clientUpload;
        return this;
    }
    public Integer getClientUpload() {
        return this.clientUpload;
    }

    public SaveApgroupPortalConfigRequest setCountdown(Integer countdown) {
        this.countdown = countdown;
        return this;
    }
    public Integer getCountdown() {
        return this.countdown;
    }

    public SaveApgroupPortalConfigRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApgroupPortalConfigRequest setPortalTypes(java.util.List<String> portalTypes) {
        this.portalTypes = portalTypes;
        return this;
    }
    public java.util.List<String> getPortalTypes() {
        return this.portalTypes;
    }

    public SaveApgroupPortalConfigRequest setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }
    public String getPortalUrl() {
        return this.portalUrl;
    }

    public SaveApgroupPortalConfigRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public SaveApgroupPortalConfigRequest setTotalDownload(Integer totalDownload) {
        this.totalDownload = totalDownload;
        return this;
    }
    public Integer getTotalDownload() {
        return this.totalDownload;
    }

    public SaveApgroupPortalConfigRequest setTotalUpload(Integer totalUpload) {
        this.totalUpload = totalUpload;
        return this;
    }
    public Integer getTotalUpload() {
        return this.totalUpload;
    }

    public SaveApgroupPortalConfigRequest setWebAuthUrl(String webAuthUrl) {
        this.webAuthUrl = webAuthUrl;
        return this;
    }
    public String getWebAuthUrl() {
        return this.webAuthUrl;
    }

    public SaveApgroupPortalConfigRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
