// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressRequest extends TeaModel {
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Standby")
    public Boolean standby;

    public static AssociateEnsEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEnsEipAddressRequest self = new AssociateEnsEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEnsEipAddressRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public AssociateEnsEipAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateEnsEipAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AssociateEnsEipAddressRequest setStandby(Boolean standby) {
        this.standby = standby;
        return this;
    }
    public Boolean getStandby() {
        return this.standby;
    }

}
