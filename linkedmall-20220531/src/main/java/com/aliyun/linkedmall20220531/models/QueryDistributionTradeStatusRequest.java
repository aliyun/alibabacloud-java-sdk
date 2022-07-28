// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionTradeStatusRequest extends TeaModel {
    @NameInMap("DistributionSupplierId")
    public String distributionSupplierId;

    @NameInMap("DistributionTradeId")
    public String distributionTradeId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryDistributionTradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionTradeStatusRequest self = new QueryDistributionTradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionTradeStatusRequest setDistributionSupplierId(String distributionSupplierId) {
        this.distributionSupplierId = distributionSupplierId;
        return this;
    }
    public String getDistributionSupplierId() {
        return this.distributionSupplierId;
    }

    public QueryDistributionTradeStatusRequest setDistributionTradeId(String distributionTradeId) {
        this.distributionTradeId = distributionTradeId;
        return this;
    }
    public String getDistributionTradeId() {
        return this.distributionTradeId;
    }

    public QueryDistributionTradeStatusRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryDistributionTradeStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
