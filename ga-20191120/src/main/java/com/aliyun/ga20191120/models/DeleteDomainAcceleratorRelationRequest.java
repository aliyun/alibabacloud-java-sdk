// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteDomainAcceleratorRelationRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance to be disassociated. You can specify up to 50 IDs.</p>
     * <br>
     * <p>If you leave this parameter empty, all GA instances associated with the specified domain name are disassociated.</p>
     */
    @NameInMap("AcceleratorIds")
    public java.util.List<String> acceleratorIds;

    /**
     * <p>The accelerated domain name to be disassociated.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDomainAcceleratorRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainAcceleratorRelationRequest self = new DeleteDomainAcceleratorRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainAcceleratorRelationRequest setAcceleratorIds(java.util.List<String> acceleratorIds) {
        this.acceleratorIds = acceleratorIds;
        return this;
    }
    public java.util.List<String> getAcceleratorIds() {
        return this.acceleratorIds;
    }

    public DeleteDomainAcceleratorRelationRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteDomainAcceleratorRelationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
