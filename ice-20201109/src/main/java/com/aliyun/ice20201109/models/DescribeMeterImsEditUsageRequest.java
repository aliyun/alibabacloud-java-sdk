// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsEditUsageRequest extends TeaModel {
    /**
     * <p>The end timestamp. The value is a 10-digit UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656995036</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The time granularity of the query. Valid values:</p>
     * <ul>
     * <li>3600: hourly</li>
     * <li>86400: daily</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>This parameter does not take effect. By default, the usage of all regions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start timestamp. The value is a 10-digit UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1654403036</p>
     */
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
