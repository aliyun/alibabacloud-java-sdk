// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnAssociateEnsEipAddressRequest extends TeaModel {
    /**
     * <p>The instance ID of the edge elastic IP address (EIP).</p>
     * <p>If the EIP is referenced by an SNAT entry, invoke DeleteSnatIpForSnatEntry to remove it first. If the EIP is referenced by a DNAT entry, invoke DeleteForwardEntry to delete it first, or set Force to true under Settings as needed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-5sqa431nx3vee8heqxfxp****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>Specifies whether to forcibly disassociate the EIP when the EIP is bound to a NAT gateway that has DNAT or SNAT entries. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): does not forcibly disassociate the EIP.</li>
     * <li><strong>true</strong>: forcibly disassociates the EIP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    public static UnAssociateEnsEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateEnsEipAddressRequest self = new UnAssociateEnsEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnAssociateEnsEipAddressRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public UnAssociateEnsEipAddressRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
