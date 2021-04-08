// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetMcuLvsIpRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMcuLvsIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcuLvsIpRequest self = new GetMcuLvsIpRequest();
        return TeaModel.build(map, self);
    }

    public GetMcuLvsIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
