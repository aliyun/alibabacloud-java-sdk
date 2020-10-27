// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AllocationId")
    @Validation(required = true)
    public String allocationId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static UnassociateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressRequest self = new UnassociateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassociateEipAddressRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public UnassociateEipAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnassociateEipAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
