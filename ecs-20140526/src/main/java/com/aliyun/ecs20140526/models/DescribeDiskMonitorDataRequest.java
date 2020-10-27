// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataRequest extends TeaModel {
    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Period")
    public Integer period;

    public static DescribeDiskMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataRequest self = new DescribeDiskMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeDiskMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiskMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiskMonitorDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

}
