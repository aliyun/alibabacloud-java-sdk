// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Attribute extends TeaModel {
    /**
     * <p>键。</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>值。</p>
     */
    @NameInMap("Value")
    public String value;

    public static Attribute build(java.util.Map<String, ?> map) throws Exception {
        Attribute self = new Attribute();
        return TeaModel.build(map, self);
    }

    public Attribute setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Attribute setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
