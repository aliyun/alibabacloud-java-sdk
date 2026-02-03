// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Predicate extends TeaModel {
    @NameInMap("children")
    public java.util.List<Predicate> children;

    @NameInMap("function")
    public String function;

    @NameInMap("kind")
    public String kind;

    @NameInMap("literals")
    public java.util.List<?> literals;

    @NameInMap("transform")
    public Transform transform;

    public static Predicate build(java.util.Map<String, ?> map) throws Exception {
        Predicate self = new Predicate();
        return TeaModel.build(map, self);
    }

    public Predicate setChildren(java.util.List<Predicate> children) {
        this.children = children;
        return this;
    }
    public java.util.List<Predicate> getChildren() {
        return this.children;
    }

    public Predicate setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public Predicate setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Predicate setLiterals(java.util.List<?> literals) {
        this.literals = literals;
        return this;
    }
    public java.util.List<?> getLiterals() {
        return this.literals;
    }

    public Predicate setTransform(Transform transform) {
        this.transform = transform;
        return this;
    }
    public Transform getTransform() {
        return this.transform;
    }

}
