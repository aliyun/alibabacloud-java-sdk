// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Tags extends TeaModel {
    // 标签名。
    @NameInMap("key")
    public String key;

    // 标签值。
    @NameInMap("value")
    public String value;

    public static Tags build(java.util.Map<String, ?> map) throws Exception {
        Tags self = new Tags();
        return TeaModel.build(map, self);
    }

    public Tags setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Tags setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
