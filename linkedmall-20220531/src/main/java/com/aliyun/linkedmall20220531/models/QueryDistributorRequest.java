// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributorRequest extends TeaModel {
    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    public static QueryDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributorRequest self = new QueryDistributorRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributorRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

}
