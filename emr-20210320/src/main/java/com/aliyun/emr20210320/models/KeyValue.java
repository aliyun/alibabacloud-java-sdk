// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class KeyValue extends TeaModel {
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

    public static KeyValue build(java.util.Map<String, ?> map) throws Exception {
        KeyValue self = new KeyValue();
        return TeaModel.build(map, self);
    }

    public KeyValue setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KeyValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
