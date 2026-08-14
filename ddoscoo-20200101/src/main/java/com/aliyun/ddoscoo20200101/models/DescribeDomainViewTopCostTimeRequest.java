// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopCostTimeRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Top")
    public Integer top;

    public static DescribeDomainViewTopCostTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopCostTimeRequest self = new DescribeDomainViewTopCostTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopCostTimeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainViewTopCostTimeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainViewTopCostTimeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainViewTopCostTimeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDomainViewTopCostTimeRequest setTop(Integer top) {
        this.top = top;
        return this;
    }
    public Integer getTop() {
        return this.top;
    }

}
