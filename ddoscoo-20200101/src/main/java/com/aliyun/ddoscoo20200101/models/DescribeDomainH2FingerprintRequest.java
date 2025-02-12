// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainH2FingerprintRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query the domain names of all websites that are protected by Anti-DDoS Proxy.</p>
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
     * 
     * <strong>example:</strong>
     * <p>1726318200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716435180</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainH2FingerprintRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainH2FingerprintRequest self = new DescribeDomainH2FingerprintRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainH2FingerprintRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainH2FingerprintRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainH2FingerprintRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeDomainH2FingerprintRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
