// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeMyCatReportInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeMyCatReportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyCatReportInfoRequest self = new DescribeMyCatReportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMyCatReportInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMyCatReportInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
