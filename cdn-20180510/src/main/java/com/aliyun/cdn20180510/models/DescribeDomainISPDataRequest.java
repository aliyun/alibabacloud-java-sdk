// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainISPDataRequest extends TeaModel {
    /**
     * <p>The beginning of the time range that was queried.</p>
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

    public static DescribeDomainISPDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainISPDataRequest self = new DescribeDomainISPDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainISPDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainISPDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainISPDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
