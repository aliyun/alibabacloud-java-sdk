// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The end time of the query. Specify the value in the UNIX timestamp format. The timestamp must be in UTC. Unit: ms.</p>
     * <br>
     * <p>>  If the time range that you specify is less than 1 hour, the monitoring data that is collected in a 1-hour period before the end time is returned.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The performance monitoring metrics. You can specify one or more metrics. Separate multiple metric names with commas (,).</p>
     * <br>
     * <p>>  For more information about performance monitoring metrics, see [Monitor instances](~~186703~~).</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The multiple of the default time interval that you want to use to collect monitoring data. By default, the system collects monitoring data of resources at an interval of 1 minute. If you set the value of this parameter to 2, the system collects monitoring data of the instance at an interval of 2 minutes.</p>
     */
    @NameInMap("PeriodMultiple")
    public Integer periodMultiple;

    /**
     * <p>The ID of the region where the instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query. Specify the value in the UNIX timestamp format. The timestamp must be in UTC. Unit: ms.</p>
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

    public DescribeDrdsInstanceMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDrdsInstanceMonitorRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
