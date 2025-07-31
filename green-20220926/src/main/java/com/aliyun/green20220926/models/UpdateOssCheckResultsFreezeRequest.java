// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFreezeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-10-21 16:08:38</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("FreezeItems")
    public String freezeItems;

    @NameInMap("FreezeRestorePath")
    public String freezeRestorePath;

    /**
     * <strong>example:</strong>
     * <p>ACL</p>
     */
    @NameInMap("FreezeType")
    public String freezeType;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>2023-08-21 16:08:38</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>P_15BU42</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateOssCheckResultsFreezeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsFreezeRequest self = new UpdateOssCheckResultsFreezeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsFreezeRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateOssCheckResultsFreezeRequest setFreezeItems(String freezeItems) {
        this.freezeItems = freezeItems;
        return this;
    }
    public String getFreezeItems() {
        return this.freezeItems;
    }

    public UpdateOssCheckResultsFreezeRequest setFreezeRestorePath(String freezeRestorePath) {
        this.freezeRestorePath = freezeRestorePath;
        return this;
    }
    public String getFreezeRestorePath() {
        return this.freezeRestorePath;
    }

    public UpdateOssCheckResultsFreezeRequest setFreezeType(String freezeType) {
        this.freezeType = freezeType;
        return this;
    }
    public String getFreezeType() {
        return this.freezeType;
    }

    public UpdateOssCheckResultsFreezeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateOssCheckResultsFreezeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateOssCheckResultsFreezeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
