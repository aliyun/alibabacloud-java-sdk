// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP to be associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-5sc1sgcrsrwgwdvx44hru****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the cloud product instance to attach the EIP to.</p>
     * <blockquote>
     * <p>Load balancing (ELB) instance IDs are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5saivuir6b1mupxjfbhmk****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the EIP instance. Valid values:</p>
     * <ul>
     * <li><strong>Nat</strong>: NAT gateway.</li>
     * <li><strong>SlbInstance</strong>: load balancing (ELB).</li>
     * <li><strong>NetworkInterface</strong>: secondary network interface controller (NIC).</li>
     * <li><strong>NatSlbInstance</strong>: select this value when attaching multiple EIPs to an ELB.</li>
     * <li><strong>EnsInstance</strong> (default): ENS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SlbInstance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the EIP is a standby EIP. Valid values:</p>
     * <ul>
     * <li><p>true: standby.</p>
     * </li>
     * <li><p>false: not standby.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
