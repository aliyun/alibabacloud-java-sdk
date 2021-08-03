// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeScanTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressRequest self = new DescribeScanTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScanTaskProgressRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
