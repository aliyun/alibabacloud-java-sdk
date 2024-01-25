// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRealDataRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTimestamp")
    public String startTimestamp;

    @NameInMap("Uid")
    public Long uid;

    public static GetRealDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealDataRequest self = new GetRealDataRequest();
        return TeaModel.build(map, self);
    }

    public GetRealDataRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public GetRealDataRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public GetRealDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRealDataRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public GetRealDataRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
