// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMpsAiUsageRequest extends TeaModel {
    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterImsMpsAiUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMpsAiUsageRequest self = new DescribeMeterImsMpsAiUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMpsAiUsageRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterImsMpsAiUsageRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeMeterImsMpsAiUsageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMeterImsMpsAiUsageRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
