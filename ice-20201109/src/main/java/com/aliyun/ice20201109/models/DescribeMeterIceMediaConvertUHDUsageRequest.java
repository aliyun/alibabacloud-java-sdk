// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMediaConvertUHDUsageRequest extends TeaModel {
    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterIceMediaConvertUHDUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMediaConvertUHDUsageRequest self = new DescribeMeterIceMediaConvertUHDUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMediaConvertUHDUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterIceMediaConvertUHDUsageRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeMeterIceMediaConvertUHDUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMeterIceMediaConvertUHDUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
