// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CancelStockOssCheckTaskRequest extends TeaModel {
    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>P_UNYVB</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelStockOssCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelStockOssCheckTaskRequest self = new CancelStockOssCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelStockOssCheckTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelStockOssCheckTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
