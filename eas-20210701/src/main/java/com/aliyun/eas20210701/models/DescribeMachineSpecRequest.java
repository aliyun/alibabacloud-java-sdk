// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecRequest extends TeaModel {
    /**
     * <p>The billing method. The default value is \<code>PostPaid\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>No input required</p>
     */
    @NameInMap("InstanceTypes")
    @Deprecated
    public java.util.List<String> instanceTypes;

    /**
     * <p>The resource type. The default value is \<code>Public\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
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
