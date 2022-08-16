// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class KeyValuePair extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static KeyValuePair build(java.util.Map<String, ?> map) throws Exception {
        KeyValuePair self = new KeyValuePair();
        return TeaModel.build(map, self);
    }

    public KeyValuePair setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public KeyValuePair setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
