// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionTradeStatusRequest extends TeaModel {
    // 渠道供应商ID
    @NameInMap("DistributionSupplierId")
    public String distributionSupplierId;

    // 分销交易号
    @NameInMap("DistributionTradeId")
    public String distributionTradeId;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public QueryDistributionTradeStatusRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
