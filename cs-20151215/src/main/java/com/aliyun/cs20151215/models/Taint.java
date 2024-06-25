// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Taint extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoSchedule</p>
     */
    @NameInMap("effect")
    public String effect;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("value")
    public String value;

    public static Taint build(java.util.Map<String, ?> map) throws Exception {
        Taint self = new Taint();
        return TeaModel.build(map, self);
    }

    public Taint setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public Taint setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Taint setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
