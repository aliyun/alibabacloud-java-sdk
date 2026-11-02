// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUsageRequest extends TeaModel {
    /**
     * <p>The end timestamp, which is a 10-digit UNIX timestamp. The maximum query interval is 31 days, which means the interval between this parameter and StartTs cannot exceed 31 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656995036</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The time granularity for the query. Valid values: 3600 (hourly) and 86400 (daily).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>This parameter does not take effect. By default, the usage data for all regions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start timestamp, which is a 10-digit UNIX timestamp. You can query data from up to 90 days ago.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1654403036</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterImsMediaConvertUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMediaConvertUsageRequest self = new DescribeMeterImsMediaConvertUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMediaConvertUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterImsMediaConvertUsageRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterImsMediaConvertUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMeterImsMediaConvertUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
