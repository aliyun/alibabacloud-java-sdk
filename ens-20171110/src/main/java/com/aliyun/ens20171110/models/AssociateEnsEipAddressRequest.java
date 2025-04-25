// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateEnsEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP that you want to associate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-5sc1sgcrsrwgwdvx44hru3p63</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the cloud service with which the EIP is associated.</p>
     * <blockquote>
     * <p> You can specify the ID of an Edge Load Balancer (ELB) instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5saivuir6b1mupxjfbhmk1xkb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance with which you want to associate the EIP. Valid values:</p>
     * <ul>
     * <li><strong>Nat</strong>: NAT gateway.</li>
     * <li><strong>SlbInstance</strong>: Edge Load Balancer (ELB) instance.</li>
     * <li><strong>NetworkInterface</strong>: secondary elastic network interface (ENI).</li>
     * <li><strong>NatSlbInstance</strong>: If you want to associate multiple EIPs with an ELB instance, you need to set the parameter to this value.</li>
     * <li><strong>EnsInstance</strong> (default): ENS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SlbInstance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the EIP is a secondary EIP. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
