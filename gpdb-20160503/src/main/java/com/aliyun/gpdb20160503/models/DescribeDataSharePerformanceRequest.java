// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataSharePerformanceRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the performance metric. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **adbpg_datashare_topic_count**: the number of shared topics.</p>
     * <p>*   **adbpg_datashare_data_size_mb**: the amount of data shared.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDataSharePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSharePerformanceRequest self = new DescribeDataSharePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSharePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDataSharePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDataSharePerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDataSharePerformanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDataSharePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
