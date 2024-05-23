// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("PeriodMultiple")
    public Integer periodMultiple;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

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

    public DescribeDrdsInstanceMonitorRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDrdsInstanceMonitorRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDrdsInstanceMonitorRequest setPeriodMultiple(Integer periodMultiple) {
        this.periodMultiple = periodMultiple;
        return this;
    }
    public Integer getPeriodMultiple() {
        return this.periodMultiple;
    }

    public DescribeDrdsInstanceMonitorRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
