// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewSourceProvincesRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainViewSourceProvincesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewSourceProvincesRequest self = new DescribeDomainViewSourceProvincesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewSourceProvincesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainViewSourceProvincesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainViewSourceProvincesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainViewSourceProvincesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
