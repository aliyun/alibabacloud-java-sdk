// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsEipAddressAttributeRequest extends TeaModel {
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Description")
    public String description;

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
