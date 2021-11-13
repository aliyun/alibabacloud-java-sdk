// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryOrderRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRequest self = new QueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
