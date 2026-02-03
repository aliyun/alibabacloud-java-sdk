// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Transform extends TeaModel {
    @NameInMap("castType")
    public FullDataType castType;

    @NameInMap("fieldRef")
    public FieldRef fieldRef;

    @NameInMap("inputs")
    public java.util.List<TransformInput> inputs;

    @NameInMap("name")
    public String name;

    public static Transform build(java.util.Map<String, ?> map) throws Exception {
        Transform self = new Transform();
        return TeaModel.build(map, self);
    }

    public Transform setCastType(FullDataType castType) {
        this.castType = castType;
        return this;
    }
    public FullDataType getCastType() {
        return this.castType;
    }

    public Transform setFieldRef(FieldRef fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }
    public FieldRef getFieldRef() {
        return this.fieldRef;
    }

    public Transform setInputs(java.util.List<TransformInput> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<TransformInput> getInputs() {
        return this.inputs;
    }

    public Transform setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
