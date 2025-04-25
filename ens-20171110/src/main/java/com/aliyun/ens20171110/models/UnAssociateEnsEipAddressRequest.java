// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnAssociateEnsEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-5sqa431nx3vee8heqxfxp****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>Specifies whether to disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): does not disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway.</li>
     * <li><strong>true</strong>: disassociates the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway.</li>
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
