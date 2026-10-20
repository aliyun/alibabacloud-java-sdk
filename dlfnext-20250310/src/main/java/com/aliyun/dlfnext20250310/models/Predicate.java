// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Predicate extends TeaModel {
    /**
     * <p>The list of child nodes.</p>
     */
    @NameInMap("children")
    public java.util.List<Predicate> children;

    /**
     * <p>The assertion function.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("function")
    public String function;

    /**
     * <p>The assertion type.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPRESSION</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The list of literal values.</p>
     */
    @NameInMap("literals")
    public java.util.List<?> literals;

    /**
     * <p>The transform rule.</p>
     */
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
