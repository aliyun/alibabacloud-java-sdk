// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class SingleOrderRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static SingleOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleOrderRequest self = new SingleOrderRequest();
        return TeaModel.build(map, self);
    }

    public SingleOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
