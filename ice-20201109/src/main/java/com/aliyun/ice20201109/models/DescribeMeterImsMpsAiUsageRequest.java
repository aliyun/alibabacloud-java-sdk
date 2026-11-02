// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMpsAiUsageRequest extends TeaModel {
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
     * <p>The time granularity. Valid values:</p>
     * <ul>
     * <li>3600: hourly granularity.</li>
     * <li>86400: daily granularity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The region. This parameter does not take effect. By default, the usage across all regions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start timestamp, which is a 10-digit UNIX timestamp. Data from up to 90 days ago can be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1654403036</p>
     */
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
