// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRegionDataRequest extends TeaModel {
    /**
     * <p>The proportions of requests that were initiated from each region.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The total number of requests.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of queries per second.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainRegionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRegionDataRequest self = new DescribeDcdnDomainRegionDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRegionDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRegionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRegionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
