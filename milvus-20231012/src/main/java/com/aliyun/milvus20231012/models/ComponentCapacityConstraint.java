// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ComponentCapacityConstraint extends TeaModel {
    @NameInMap("componentType")
    public String componentType;

    @NameInMap("maxCapacity")
    public Integer maxCapacity;

    @NameInMap("minCapacity")
    public Integer minCapacity;

    public static ComponentCapacityConstraint build(java.util.Map<String, ?> map) throws Exception {
        ComponentCapacityConstraint self = new ComponentCapacityConstraint();
        return TeaModel.build(map, self);
    }

    public ComponentCapacityConstraint setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public ComponentCapacityConstraint setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    public ComponentCapacityConstraint setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }
    public Integer getMinCapacity() {
        return this.minCapacity;
    }

}
