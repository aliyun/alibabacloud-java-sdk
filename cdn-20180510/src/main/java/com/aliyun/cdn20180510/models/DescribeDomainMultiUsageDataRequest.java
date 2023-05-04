// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMultiUsageDataRequest extends TeaModel {
    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The information about requests collected every 5 minutes.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainMultiUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMultiUsageDataRequest self = new DescribeDomainMultiUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMultiUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainMultiUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainMultiUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
