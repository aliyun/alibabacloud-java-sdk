// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaPlanRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>483212237127906</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetQuotaPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaPlanRequest self = new GetQuotaPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQuotaPlanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
