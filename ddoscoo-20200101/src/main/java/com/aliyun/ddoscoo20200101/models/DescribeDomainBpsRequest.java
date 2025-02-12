// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1722339300</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The interval for returning data. Unit: seconds. Valid values are 300, 3600, and 86400. If the time span between StartTime and EndTime is less than 3 days, valid values are 300, 3600, and 86400. If the time span between StartTime and EndTime is from 3 to 30 days, valid values are 3600 and 86400. If the time span between StartTime and EndTime is 31 days or longer, the valid value is 86400. If you leave this parameter empty or specify an invalid value, the default value is used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The region in which your service is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn</strong>: a region in the Chinese mainland.</li>
     * <li><strong>cn-hongkong</strong>: a region outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1719211800</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainBpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsRequest self = new DescribeDomainBpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainBpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainBpsRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeDomainBpsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDomainBpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
