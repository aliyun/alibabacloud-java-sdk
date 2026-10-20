// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Taint extends TeaModel {
    /**
     * <p>The scheduling policy. Valid values:</p>
     * <ul>
     * <li><p><code>NoSchedule</code>: Not tolerated. This affects only the scheduling process. Already scheduled pods are not affected. This applies only to newly added pods.</p>
     * </li>
     * <li><p><code>NoExecute</code>: Not tolerated. When the taint changes, the pod is evicted.</p>
     * </li>
     * <li><p><code>PreferNoSchedule</code>: Soft constraint. Existing pods on the node are not affected. The scheduler tries to avoid scheduling pods that do not tolerate the taint to the node.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>NoSchedule</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSchedule</p>
     */
    @NameInMap("effect")
    public String effect;

    /**
     * <p>The key of the taint.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The value of the taint.</p>
     * 
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
