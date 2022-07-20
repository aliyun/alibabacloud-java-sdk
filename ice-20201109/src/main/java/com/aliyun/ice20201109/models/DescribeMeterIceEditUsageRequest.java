// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceEditUsageRequest extends TeaModel {
    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterIceEditUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceEditUsageRequest self = new DescribeMeterIceEditUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceEditUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterIceEditUsageRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterIceEditUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMeterIceEditUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
