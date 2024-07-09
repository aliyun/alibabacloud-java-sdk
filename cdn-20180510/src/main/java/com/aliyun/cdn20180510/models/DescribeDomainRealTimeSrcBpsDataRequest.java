// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcBpsDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify up to 100 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-12-10T20:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRealTimeSrcBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcBpsDataRequest self = new DescribeDomainRealTimeSrcBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeSrcBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeSrcBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
