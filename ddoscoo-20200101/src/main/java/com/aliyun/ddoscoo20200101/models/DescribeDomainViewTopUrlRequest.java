// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopUrlRequest extends TeaModel {
    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have a website service forwarding rule configured. You can invoke <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names that are added to Anti-DDoS Pro and Anti-DDoS Premium.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the exact minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1583683200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The step size for returning data, in seconds. This parameter specifies the interval at which a result is returned. The supported step size varies based on the query time range (determined by <strong>StartTime</strong> and <strong>EndTime</strong>). Recommended settings:</p>
     * <ul>
     * <li>Query time range of up to 1 hour: minimum step size of 60 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range of more than 1 hour but up to 6 hours: minimum step size of 600 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range of more than 6 hours but up to 24 hours: minimum step size of 1800 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range of more than 24 hours but up to 7 days: minimum step size of 3600 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range of more than 7 days but up to 15 days: minimum step size of 14400 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range of more than 15 days: minimum step size of 43200 seconds, maximum not exceeding the query time range.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Inerval")
    public Long inerval;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the exact minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1582992000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The number of URLs to return. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Top")
    public Integer top;

    public static DescribeDomainViewTopUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopUrlRequest self = new DescribeDomainViewTopUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopUrlRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainViewTopUrlRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainViewTopUrlRequest setInerval(Long inerval) {
        this.inerval = inerval;
        return this;
    }
    public Long getInerval() {
        return this.inerval;
    }

    public DescribeDomainViewTopUrlRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainViewTopUrlRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainViewTopUrlRequest setTop(Integer top) {
        this.top = top;
        return this;
    }
    public Integer getTop() {
        return this.top;
    }

}
