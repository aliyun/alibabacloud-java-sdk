// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventSubscriptionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetEventSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventSubscriptionRequest self = new GetEventSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public GetEventSubscriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
