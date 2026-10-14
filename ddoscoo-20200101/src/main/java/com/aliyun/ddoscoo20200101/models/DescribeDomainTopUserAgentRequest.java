// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUserAgentRequest extends TeaModel {
    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have a website traffic forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end time of the query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the hour or half hour.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1708352700</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region of the service. Valid values:</p>
     * <ul>
     * <li><strong>cn</strong>: the Chinese mainland.</li>
     * <li><strong>cn-hongkong</strong>: outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the hour or half hour.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1609430400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainTopUserAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopUserAgentRequest self = new DescribeDomainTopUserAgentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopUserAgentRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainTopUserAgentRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainTopUserAgentRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeDomainTopUserAgentRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeDomainTopUserAgentRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDomainTopUserAgentRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
