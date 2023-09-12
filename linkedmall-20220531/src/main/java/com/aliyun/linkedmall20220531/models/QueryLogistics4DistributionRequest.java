// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryLogistics4DistributionRequest extends TeaModel {
    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("MainDistributionOrderId")
    public String mainDistributionOrderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLogistics4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLogistics4DistributionRequest self = new QueryLogistics4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryLogistics4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryLogistics4DistributionRequest setMainDistributionOrderId(String mainDistributionOrderId) {
        this.mainDistributionOrderId = mainDistributionOrderId;
        return this;
    }
    public String getMainDistributionOrderId() {
        return this.mainDistributionOrderId;
    }

    public QueryLogistics4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLogistics4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
