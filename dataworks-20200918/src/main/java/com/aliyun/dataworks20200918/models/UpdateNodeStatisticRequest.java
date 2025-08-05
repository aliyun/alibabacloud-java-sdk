// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeStatisticRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AvgCost")
    public Integer avgCost;

    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateNodeStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeStatisticRequest self = new UpdateNodeStatisticRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeStatisticRequest setAvgCost(Integer avgCost) {
        this.avgCost = avgCost;
        return this;
    }
    public Integer getAvgCost() {
        return this.avgCost;
    }

    public UpdateNodeStatisticRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UpdateNodeStatisticRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public UpdateNodeStatisticRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
