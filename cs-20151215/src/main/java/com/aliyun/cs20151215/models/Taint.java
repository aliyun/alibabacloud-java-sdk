// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Taint extends TeaModel {
    /**
     * <p>The scheduling policy. Valid values:</p>
     * <ul>
     * <li><code>NoSchedule</code>: This taint is not tolerated. However, pods that are already scheduled to the node are not affected.</li>
     * <li><code>NoExecute</code>: Pods that do not tolerate this taint are evicted after this taint is added to the node.</li>
     * <li><code>PreferNoSchedule</code>: This value specifies a soft limit on pods. Existing pods on the node are not affected. The scheduler attempts to avoid scheduling pods that cannot tolerate the taint to the node.</li>
     * </ul>
     * <p>Default value: <code>NoSchedule</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSchedule</p>
     */
    @NameInMap("effect")
    public String effect;

    /**
     * <p>The <code>key</code> of the taint.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The <code>value</code> of the taint.</p>
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
