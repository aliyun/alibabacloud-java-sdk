// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDrivesRequest extends TeaModel {
    @NameInMap("DomainIds")
    public java.util.List<String> domainIds;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("UserId")
    public String userId;

    public static DescribeDrivesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrivesRequest self = new DescribeDrivesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrivesRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public DescribeDrivesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDrivesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDrivesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
