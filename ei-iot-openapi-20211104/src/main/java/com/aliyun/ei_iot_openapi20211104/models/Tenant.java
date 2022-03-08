// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class Tenant extends TeaModel {
    // 租户ID
    @NameInMap("TenantId")
    public Long tenantId;

    public static Tenant build(java.util.Map<String, ?> map) throws Exception {
        Tenant self = new Tenant();
        return TeaModel.build(map, self);
    }

    public Tenant setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
