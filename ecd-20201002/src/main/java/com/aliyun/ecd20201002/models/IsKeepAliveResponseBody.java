// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class IsKeepAliveResponseBody extends TeaModel {
    @NameInMap("IsKeepAlive")
    public Boolean isKeepAlive;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantId")
    public String tenantId;

    public static IsKeepAliveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsKeepAliveResponseBody self = new IsKeepAliveResponseBody();
        return TeaModel.build(map, self);
    }

    public IsKeepAliveResponseBody setIsKeepAlive(Boolean isKeepAlive) {
        this.isKeepAlive = isKeepAlive;
        return this;
    }
    public Boolean getIsKeepAlive() {
        return this.isKeepAlive;
    }

    public IsKeepAliveResponseBody setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public IsKeepAliveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IsKeepAliveResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
