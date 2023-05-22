// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainMultiUsageDataRequest extends TeaModel {
    /**
     * <p>If this parameter is not set, data of all your accelerated domain names is queried.</p>
     * <br>
     * <p>You can specify one or more accelerated domain names. Separate domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time must be later than the start time.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>*   The time must be in UTC.</p>
     * <p>*   You must set both the start time and the end time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>*   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>*   The time must be in UTC.</p>
     * <p>*   The minimum data granularity is 5 minutes.</p>
     * <p>*   If you do not set this parameter, data in the last 24 hours is queried.</p>
     * <p>*   You must set both the start time and the end time.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainMultiUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainMultiUsageDataRequest self = new DescribeDcdnDomainMultiUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainMultiUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainMultiUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainMultiUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
