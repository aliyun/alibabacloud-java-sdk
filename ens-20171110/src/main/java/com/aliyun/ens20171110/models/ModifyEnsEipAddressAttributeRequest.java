// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsEipAddressAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: **5** to **10000**. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The new description of the EIP. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new name of the EIP. The name must be 2 to 128 characters in length and cannot start with http:// or https://.</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyEnsEipAddressAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnsEipAddressAttributeRequest self = new ModifyEnsEipAddressAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEnsEipAddressAttributeRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public ModifyEnsEipAddressAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifyEnsEipAddressAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyEnsEipAddressAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
