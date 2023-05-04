// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataRequest extends TeaModel {
    /**
     * <p>The beginning of the time range during which data was queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
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
