// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsSummaryRequest extends TeaModel {
    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterImsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsSummaryRequest self = new DescribeMeterImsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsSummaryRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterImsSummaryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMeterImsSummaryRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
