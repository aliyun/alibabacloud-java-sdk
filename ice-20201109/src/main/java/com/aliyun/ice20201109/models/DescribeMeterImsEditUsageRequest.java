// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsEditUsageRequest extends TeaModel {
    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterImsEditUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsEditUsageRequest self = new DescribeMeterImsEditUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsEditUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterImsEditUsageRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterImsEditUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMeterImsEditUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
