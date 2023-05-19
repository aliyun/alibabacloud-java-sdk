// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRegionDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.  </p>
     * <br>
     * <p>The end time must be later than the start time.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The proportion of bytes transferred from each region. For example, a value of 90 indicates that 90% of the bytes are transferred from the specified area.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The information of the regions.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRegionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRegionDataRequest self = new DescribeDomainRegionDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRegionDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRegionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRegionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
