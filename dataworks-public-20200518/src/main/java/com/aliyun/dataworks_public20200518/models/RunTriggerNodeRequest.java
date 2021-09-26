// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunTriggerNodeRequest extends TeaModel {
    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("CycleTime")
    public Long cycleTime;

    @NameInMap("BizDate")
    public Long bizDate;

    @NameInMap("AppId")
    public Long appId;

    public static RunTriggerNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTriggerNodeRequest self = new RunTriggerNodeRequest();
        return TeaModel.build(map, self);
    }

    public RunTriggerNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public RunTriggerNodeRequest setCycleTime(Long cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public Long getCycleTime() {
        return this.cycleTime;
    }

    public RunTriggerNodeRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public RunTriggerNodeRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
