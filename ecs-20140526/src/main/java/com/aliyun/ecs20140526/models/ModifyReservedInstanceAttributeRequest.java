// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ReservedInstanceId")
    @Validation(required = true)
    public String reservedInstanceId;

    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("Description")
    public String description;

    public static ModifyReservedInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceAttributeRequest self = new ModifyReservedInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyReservedInstanceAttributeRequest setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }
    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public ModifyReservedInstanceAttributeRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public ModifyReservedInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
