// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUHDUsageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
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
