// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Taints extends TeaModel {
    // 污点名。
    @NameInMap("key")
    public String key;

    // 污点值。
    @NameInMap("value")
    public String value;

    // 污点生效策略。
    @NameInMap("effect")
    public String effect;

    public static Taints build(java.util.Map<String, ?> map) throws Exception {
        Taints self = new Taints();
        return TeaModel.build(map, self);
    }

    public Taints setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Taints setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public Taints setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

}
