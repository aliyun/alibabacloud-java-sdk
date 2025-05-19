// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeTaskDetailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>339e0d96-2505-425f-a5c6-22e2c12f8fee</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskDetailRequest self = new DescribeTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
