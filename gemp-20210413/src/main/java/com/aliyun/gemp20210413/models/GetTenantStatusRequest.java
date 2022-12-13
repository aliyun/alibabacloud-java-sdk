// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantStatusRequest extends TeaModel {
    @NameInMap("tenantRamId")
    public Long tenantRamId;

    public static GetTenantStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTenantStatusRequest self = new GetTenantStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTenantStatusRequest setTenantRamId(Long tenantRamId) {
        this.tenantRamId = tenantRamId;
        return this;
    }
    public Long getTenantRamId() {
        return this.tenantRamId;
    }

}
