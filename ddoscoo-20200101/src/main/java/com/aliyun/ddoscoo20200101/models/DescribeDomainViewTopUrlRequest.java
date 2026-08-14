// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopUrlRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Inerval")
    public Long inerval;

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
