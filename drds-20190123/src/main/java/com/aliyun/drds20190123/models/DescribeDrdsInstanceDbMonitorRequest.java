// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceDbMonitorRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the Distributed Relational Database Service (DRDS) instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The end time. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The performance monitoring metrics. You can specify one or more metrics for a query at a time. Separate multiple metric parameters with commas (,).</p>
     * <br>
     * <p>>  For more information about the details of performance monitoring metrics, see [Database monitoring](~~186704~~).</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDrdsInstanceDbMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceDbMonitorRequest self = new DescribeDrdsInstanceDbMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceDbMonitorRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDrdsInstanceDbMonitorRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsInstanceDbMonitorRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDrdsInstanceDbMonitorRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDrdsInstanceDbMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDrdsInstanceDbMonitorRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
