// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeListRequest extends TeaModel {
    /**
     * <p>The domain name of the website. If you do not specify this parameter, the statistics on response status codes of all domain names are queried.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The interval for returning data. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The source of the statistics. Valid values:</p>
     * <br>
     * <p>*   **gf**: Anti-DDoS Pro or Anti-DDoS Premium</p>
     * <p>*   **upstrem**: origin server</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time of the event. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainStatusCodeListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatusCodeListRequest self = new DescribeDomainStatusCodeListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatusCodeListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainStatusCodeListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainStatusCodeListRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeDomainStatusCodeListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeDomainStatusCodeListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainStatusCodeListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
