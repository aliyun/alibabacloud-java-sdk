// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetIfEcsTypeSupportHtConfigRequest extends TeaModel {
    /**
     * <p>The Elastic Compute Service (ECS) instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static GetIfEcsTypeSupportHtConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIfEcsTypeSupportHtConfigRequest self = new GetIfEcsTypeSupportHtConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetIfEcsTypeSupportHtConfigRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
