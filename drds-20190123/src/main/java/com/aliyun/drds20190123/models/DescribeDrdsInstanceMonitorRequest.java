// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("Key")
    public String key;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PeriodMultiple")
    public Integer periodMultiple;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsInstanceMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceMonitorRequest self = new DescribeDrdsInstanceMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceMonitorRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsInstanceMonitorRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDrdsInstanceMonitorRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDrdsInstanceMonitorRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDrdsInstanceMonitorRequest setPeriodMultiple(Integer periodMultiple) {
        this.periodMultiple = periodMultiple;
        return this;
    }
    public Integer getPeriodMultiple() {
        return this.periodMultiple;
    }

    public DescribeDrdsInstanceMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
