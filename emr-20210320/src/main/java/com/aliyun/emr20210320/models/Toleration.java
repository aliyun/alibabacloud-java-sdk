// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Toleration extends TeaModel {
    @NameInMap("Effect")
    public String effect;

    @NameInMap("Key")
    public String key;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Value")
    public String value;

    public static Toleration build(java.util.Map<String, ?> map) throws Exception {
        Toleration self = new Toleration();
        return TeaModel.build(map, self);
    }

    public Toleration setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public Toleration setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Toleration setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Toleration setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
