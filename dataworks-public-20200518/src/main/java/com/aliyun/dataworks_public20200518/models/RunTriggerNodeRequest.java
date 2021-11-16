// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunTriggerNodeRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("BizDate")
    public Long bizDate;

    @NameInMap("CycleTime")
    public Long cycleTime;

    @NameInMap("NodeId")
    public Long nodeId;

    public static RunTriggerNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTriggerNodeRequest self = new RunTriggerNodeRequest();
        return TeaModel.build(map, self);
    }

    public RunTriggerNodeRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RunTriggerNodeRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public RunTriggerNodeRequest setCycleTime(Long cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public Long getCycleTime() {
        return this.cycleTime;
    }

    public RunTriggerNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

}
