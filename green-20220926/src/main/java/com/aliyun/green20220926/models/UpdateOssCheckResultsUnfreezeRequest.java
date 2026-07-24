// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsUnfreezeRequest extends TeaModel {
    /**
     * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-21 16:08:38</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The frozen items.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("FreezeItems")
    public String freezeItems;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-21 16:08:38</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>P_B6YRVD</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateOssCheckResultsUnfreezeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsUnfreezeRequest self = new UpdateOssCheckResultsUnfreezeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsUnfreezeRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateOssCheckResultsUnfreezeRequest setFreezeItems(String freezeItems) {
        this.freezeItems = freezeItems;
        return this;
    }
    public String getFreezeItems() {
        return this.freezeItems;
    }

    public UpdateOssCheckResultsUnfreezeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateOssCheckResultsUnfreezeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateOssCheckResultsUnfreezeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
