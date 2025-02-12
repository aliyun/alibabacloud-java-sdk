// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopFingerprintRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1723552200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The interval for returning data. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

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
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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

    public static DescribeDomainTopFingerprintRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopFingerprintRequest self = new DescribeDomainTopFingerprintRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopFingerprintRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainTopFingerprintRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopFingerprintRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeDomainTopFingerprintRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeDomainTopFingerprintRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDomainTopFingerprintRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
