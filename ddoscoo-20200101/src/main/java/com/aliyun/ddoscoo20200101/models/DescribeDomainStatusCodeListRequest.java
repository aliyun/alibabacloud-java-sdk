// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeListRequest extends TeaModel {
    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query the domain names of all website services that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the exact minute.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1583683200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time interval between consecutive data entries returned. Unit: seconds. This parameter specifies how frequently a query result is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The source of the query data. Valid values:</p>
     * <ul>
     * <li><strong>gf</strong>: Anti-DDoS Pro or Anti-DDoS Premium response data.</li>
     * <li><strong>upstream</strong>: origin server response data.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>upstream</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. By default, this parameter is empty, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information about resource groups, refer to <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
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
