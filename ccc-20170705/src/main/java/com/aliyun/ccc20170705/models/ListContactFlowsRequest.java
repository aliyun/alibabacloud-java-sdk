// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListContactFlowsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListContactFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsRequest self = new ListContactFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
