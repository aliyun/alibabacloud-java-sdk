// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallRequest extends TeaModel {
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryDistributionMallRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionMallRequest self = new QueryDistributionMallRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionMallRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryDistributionMallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
