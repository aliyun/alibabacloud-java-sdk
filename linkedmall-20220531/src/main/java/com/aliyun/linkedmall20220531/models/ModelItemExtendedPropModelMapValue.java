// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModelItemExtendedPropModelMapValue extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ValueStart")
    public String valueStart;

    @NameInMap("ValueEnd")
    public String valueEnd;

    @NameInMap("Key")
    public String key;

    @NameInMap("ChildProps")
    public java.util.Map<String, ?> childProps;

    public static ModelItemExtendedPropModelMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModelItemExtendedPropModelMapValue self = new ModelItemExtendedPropModelMapValue();
        return TeaModel.build(map, self);
    }

    public ModelItemExtendedPropModelMapValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelItemExtendedPropModelMapValue setValueStart(String valueStart) {
        this.valueStart = valueStart;
        return this;
    }
    public String getValueStart() {
        return this.valueStart;
    }

    public ModelItemExtendedPropModelMapValue setValueEnd(String valueEnd) {
        this.valueEnd = valueEnd;
        return this;
    }
    public String getValueEnd() {
        return this.valueEnd;
    }

    public ModelItemExtendedPropModelMapValue setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ModelItemExtendedPropModelMapValue setChildProps(java.util.Map<String, ?> childProps) {
        this.childProps = childProps;
        return this;
    }
    public java.util.Map<String, ?> getChildProps() {
        return this.childProps;
    }

}
