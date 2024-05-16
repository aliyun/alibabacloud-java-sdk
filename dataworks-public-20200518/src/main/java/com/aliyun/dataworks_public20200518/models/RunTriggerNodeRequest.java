// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunTriggerNodeRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace to which the manually triggered node belongs. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The data timestamp of the manually triggered node instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizDate")
    public Long bizDate;

    /**
     * <p>The scheduled time to run the manually triggered node. Set the value to a 13-digit timestamp in milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CycleTime")
    public Long cycleTime;

    /**
     * <p>The ID of the manually triggered node. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
