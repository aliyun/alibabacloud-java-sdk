// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataRequest extends TeaModel {
    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The end of the time range during which you want to query the near real-time monitoring data of the disk. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The interval at which the near real-time monitoring data is collected. Unit: seconds. Valid values:</p>
     * <br>
     * <p>*   5</p>
     * <p>*   60</p>
     * <br>
     * <p>Default value: 5.</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The region ID of the disk.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range during which you want to query the near real-time monitoring data of the disk. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the monitoring data. Valid values:</p>
     * <br>
     * <p>*   basic: baseline performance data.</p>
     * <p>*   pro: burst performance data, such as burst I/O operations.</p>
     */
    @NameInMap("Type")
    public String type;

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

    public DescribeDiskMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiskMonitorDataRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public DescribeDiskMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiskMonitorDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
