// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteQuotaRequest extends TeaModel {
    @NameInMap("region")
    public String region;

    @NameInMap("tenantId")
    public String tenantId;

    public static DeleteQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaRequest self = new DeleteQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
