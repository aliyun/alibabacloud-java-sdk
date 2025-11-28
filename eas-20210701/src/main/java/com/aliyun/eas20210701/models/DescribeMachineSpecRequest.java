// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("InstanceTypes")
    @Deprecated
    public java.util.List<String> instanceTypes;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeMachineSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineSpecRequest self = new DescribeMachineSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMachineSpecRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    @Deprecated
    public DescribeMachineSpecRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeMachineSpecRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
