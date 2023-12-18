// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the cloud service with which you want to associate the EIP.</p>
     * <br>
     * <p>>  IDs of Edge Load Balancer (ELB) are supported.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance with which you want to associate the EIP. Valid values:</p>
     * <br>
     * <p>*   **Nat**: a NAT gateway</p>
     * <p>*   **SlbInstance**: an ELB instance.</p>
     * <p>*   **NetworkInterface**: a secondary ENI</p>
     * <p>*   **NatSlbInstance**: If you want to associate multiple EIPs to an ELB instance, you need to set the parameter to this value.</p>
     * <p>*   **EnsInstance** (default): an ENS instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the EIP is a secondary EIP. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
