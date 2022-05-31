// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallRequest extends TeaModel {
    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

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

}
