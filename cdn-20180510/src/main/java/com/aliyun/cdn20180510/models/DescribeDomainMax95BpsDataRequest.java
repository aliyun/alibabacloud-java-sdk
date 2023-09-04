// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMax95BpsDataRequest extends TeaModel {
    /**
     * <p>The cycle to query the 95th percentile bandwidth data. Default value: **day**. Valid values:</p>
     * <br>
     * <p>*   **day**: queries the 95th percentile bandwidth data by day.</p>
     * <p>*   **month**: queries the 95th percentile bandwidth data by month.</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>The accelerated domain name. If you do not specify a domain name, data of all domain names is queried.</p>
     * <br>
     * <p>> You cannot specify multiple domain names in a DescribeDomainMax95BpsData request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("TimePoint")
    public String timePoint;

    public static DescribeDomainMax95BpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMax95BpsDataRequest self = new DescribeDomainMax95BpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMax95BpsDataRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public DescribeDomainMax95BpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainMax95BpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainMax95BpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainMax95BpsDataRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
