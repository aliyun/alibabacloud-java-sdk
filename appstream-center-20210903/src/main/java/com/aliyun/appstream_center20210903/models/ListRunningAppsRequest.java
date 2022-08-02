// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListRunningAppsRequest extends TeaModel {
    @NameInMap("BizRegionId")
    public String bizRegionId;

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

    @NameInMap("LoginRegionId")
    public String loginRegionId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Uuid")
    public String uuid;

    public static ListRunningAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRunningAppsRequest self = new ListRunningAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListRunningAppsRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListRunningAppsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ListRunningAppsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ListRunningAppsRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public ListRunningAppsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ListRunningAppsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListRunningAppsRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public ListRunningAppsRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ListRunningAppsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListRunningAppsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListRunningAppsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListRunningAppsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
