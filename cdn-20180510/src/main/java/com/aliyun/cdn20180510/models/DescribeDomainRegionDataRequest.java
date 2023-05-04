// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRegionDataRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The accelerated domain name.</p>
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
