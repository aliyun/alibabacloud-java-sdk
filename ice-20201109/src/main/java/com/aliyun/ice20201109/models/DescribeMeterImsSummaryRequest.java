// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsSummaryRequest extends TeaModel {
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
     * <p>This parameter does not take effect. By default, the usage data of all regions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. The value is a 10-digit timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1654403036</p>
     */
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
