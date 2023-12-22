// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class UnbindRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

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
    public Long tenantId;

    public static UnbindRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindRequest self = new UnbindRequest();
        return TeaModel.build(map, self);
    }

    public UnbindRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public UnbindRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UnbindRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UnbindRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public UnbindRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public UnbindRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UnbindRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public UnbindRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public UnbindRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public UnbindRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UnbindRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UnbindRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
