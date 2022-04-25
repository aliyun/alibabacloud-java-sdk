// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetMonitorItemRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    public static GetMonitorItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorItemRequest self = new GetMonitorItemRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitorItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMonitorItemRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

}
