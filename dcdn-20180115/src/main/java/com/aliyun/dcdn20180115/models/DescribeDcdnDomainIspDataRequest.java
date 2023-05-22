// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIspDataRequest extends TeaModel {
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

    public static DescribeDcdnDomainIspDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIspDataRequest self = new DescribeDcdnDomainIspDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIspDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIspDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIspDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
