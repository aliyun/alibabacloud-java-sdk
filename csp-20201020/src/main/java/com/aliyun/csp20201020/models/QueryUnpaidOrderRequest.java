// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryUnpaidOrderRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryUnpaidOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnpaidOrderRequest self = new QueryUnpaidOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnpaidOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
