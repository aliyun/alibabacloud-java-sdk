// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaPlanRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateQuotaPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaPlanRequest self = new UpdateQuotaPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaPlanRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateQuotaPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateQuotaPlanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
