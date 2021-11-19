// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class RequestContext extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 外部用户ID
    @NameInMap("ExternalUserId")
    public String externalUserId;

    // 代理账号唯一ID，集团内部为bucId值
    @NameInMap("ExternalUserOrgnizationId")
    public String externalUserOrgnizationId;

    // 签名
    @NameInMap("Sign")
    public String sign;

    // 租户uuid
    @NameInMap("TenantId")
    public String tenantId;

    // 代理账号用户类型，集团内部为buc
    @NameInMap("UserType")
    public String userType;

    public static RequestContext build(java.util.Map<String, ?> map) throws Exception {
        RequestContext self = new RequestContext();
        return TeaModel.build(map, self);
    }

    public RequestContext setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RequestContext setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public RequestContext setExternalUserOrgnizationId(String externalUserOrgnizationId) {
        this.externalUserOrgnizationId = externalUserOrgnizationId;
        return this;
    }
    public String getExternalUserOrgnizationId() {
        return this.externalUserOrgnizationId;
    }

    public RequestContext setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public RequestContext setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RequestContext setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
