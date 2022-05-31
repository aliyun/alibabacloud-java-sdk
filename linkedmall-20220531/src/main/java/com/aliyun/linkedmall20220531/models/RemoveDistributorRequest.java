// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RemoveDistributorRequest extends TeaModel {
    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    public static RemoveDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDistributorRequest self = new RemoveDistributorRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDistributorRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

}
