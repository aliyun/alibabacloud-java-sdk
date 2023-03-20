// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackMaxQpsRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainAttackMaxQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackMaxQpsRequest self = new DescribeDomainAttackMaxQpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackMaxQpsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainAttackMaxQpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainAttackMaxQpsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainAttackMaxQpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
