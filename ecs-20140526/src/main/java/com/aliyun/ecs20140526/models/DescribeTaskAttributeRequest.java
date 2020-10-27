// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTaskAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static DescribeTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskAttributeRequest self = new DescribeTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTaskAttributeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
