// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify one or more domain names and separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time.</p>
     * <blockquote>
     * <p>If you do not specify StartTime or EndTime, data within the last hour is queried. If you specify both StartTime and EndTime, data within the specified time range is queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>If you do not specify StartTime or EndTime, data within the last hour is queried. If you specify both StartTime and EndTime, data within the specified time range is queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainRealTimeTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeTrafficDataRequest self = new DescribeDcdnDomainRealTimeTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeTrafficDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRealTimeTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRealTimeTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
