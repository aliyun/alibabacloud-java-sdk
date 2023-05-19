// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataRequest extends TeaModel {
    /**
     * <p>The timestamp of the returned data.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of PVs at each interval.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainPvDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPvDataRequest self = new DescribeDomainPvDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPvDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPvDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPvDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
