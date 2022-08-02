// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class StopAppRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("ClientChannel")
    public String clientChannel;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("ForceStop")
    public Boolean forceStop;

    @NameInMap("IdpId")
    public String idpId;

    @NameInMap("LoginRegionId")
    public String loginRegionId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("WyId")
    public String wyId;

    public static StopAppRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAppRequest self = new StopAppRequest();
        return TeaModel.build(map, self);
    }

    public StopAppRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public StopAppRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public StopAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopAppRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public StopAppRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public StopAppRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public StopAppRequest setClientChannel(String clientChannel) {
        this.clientChannel = clientChannel;
        return this;
    }
    public String getClientChannel() {
        return this.clientChannel;
    }

    public StopAppRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public StopAppRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public StopAppRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public StopAppRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public StopAppRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public StopAppRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopAppRequest setIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }
    public String getIdpId() {
        return this.idpId;
    }

    public StopAppRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public StopAppRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public StopAppRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public StopAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopAppRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StopAppRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public StopAppRequest setWyId(String wyId) {
        this.wyId = wyId;
        return this;
    }
    public String getWyId() {
        return this.wyId;
    }

}
