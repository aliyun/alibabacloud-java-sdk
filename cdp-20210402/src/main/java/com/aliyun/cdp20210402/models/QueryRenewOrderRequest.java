// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewOrderRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryRenewOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewOrderRequest self = new QueryRenewOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryRenewOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
