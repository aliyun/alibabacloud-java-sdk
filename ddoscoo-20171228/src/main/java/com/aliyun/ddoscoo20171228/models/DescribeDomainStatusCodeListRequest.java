// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>1583683200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>upstream</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
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
