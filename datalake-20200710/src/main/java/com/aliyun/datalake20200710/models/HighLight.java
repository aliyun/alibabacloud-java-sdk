// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class HighLight extends TeaModel {
    // 高亮的key
    @NameInMap("Key")
    public String key;

    // 高亮的value
    @NameInMap("Value")
    public String value;

    public static HighLight build(java.util.Map<String, ?> map) throws Exception {
        HighLight self = new HighLight();
        return TeaModel.build(map, self);
    }

    public HighLight setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public HighLight setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
