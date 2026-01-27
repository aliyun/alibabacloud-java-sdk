// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class IsKeepAliveResponseBody extends TeaModel {
    /**
     * <p>Identifies whether the user should remain logged on to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsKeepAlive")
    public Boolean isKeepAlive;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-885351****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID (UID) of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>141631846826****</p>
     */
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
