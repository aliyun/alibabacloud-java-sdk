// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetJwtCommonRequest extends TeaModel {
    @NameInMap("LoginType")
    public String loginType;

    @NameInMap("TenantCode")
    public String tenantCode;

    @NameInMap("TenantUid")
    public String tenantUid;

    public static GetJwtCommonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJwtCommonRequest self = new GetJwtCommonRequest();
        return TeaModel.build(map, self);
    }

    public GetJwtCommonRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public GetJwtCommonRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public GetJwtCommonRequest setTenantUid(String tenantUid) {
        this.tenantUid = tenantUid;
        return this;
    }
    public String getTenantUid() {
        return this.tenantUid;
    }

}
