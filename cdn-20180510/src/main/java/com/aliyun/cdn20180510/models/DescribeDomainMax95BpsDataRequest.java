// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMax95BpsDataRequest extends TeaModel {
    /**
     * <p>1001</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>data.content.domesticMax95Bps</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The 95th percentile bandwidth.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>data.content.overseasMax95Bps</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>data.content.max95Bps</p>
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
