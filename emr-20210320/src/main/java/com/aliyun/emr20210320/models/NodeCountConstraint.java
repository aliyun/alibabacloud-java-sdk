// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeCountConstraint extends TeaModel {
    @NameInMap("Max")
    public Integer max;

    @NameInMap("Min")
    public Integer min;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("Values")
    public java.util.List<Integer> values;

    public static NodeCountConstraint build(java.util.Map<String, ?> map) throws Exception {
        NodeCountConstraint self = new NodeCountConstraint();
        return TeaModel.build(map, self);
    }

    public NodeCountConstraint setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public NodeCountConstraint setMin(Integer min) {
        this.min = min;
        return this;
    }
    public Integer getMin() {
        return this.min;
    }

    public NodeCountConstraint setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NodeCountConstraint setValues(java.util.List<Integer> values) {
        this.values = values;
        return this;
    }
    public java.util.List<Integer> getValues() {
        return this.values;
    }

}
