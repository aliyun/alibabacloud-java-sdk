// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUHDUsageRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a 10-digit timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656995036</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The time granularity of the query. Valid values: 3600 (hour) and 86400 (day).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>This parameter does not take effect. By default, the usage data of all regions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The value is a 10-digit timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1654403036</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterImsMediaConvertUHDUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMediaConvertUHDUsageRequest self = new DescribeMeterImsMediaConvertUHDUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMediaConvertUHDUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterImsMediaConvertUHDUsageRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeMeterImsMediaConvertUHDUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMeterImsMediaConvertUHDUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
