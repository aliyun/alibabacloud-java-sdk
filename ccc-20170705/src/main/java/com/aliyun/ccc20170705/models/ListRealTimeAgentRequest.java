// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRealTimeAgentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListRealTimeAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRealTimeAgentRequest self = new ListRealTimeAgentRequest();
        return TeaModel.build(map, self);
    }

    public ListRealTimeAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
