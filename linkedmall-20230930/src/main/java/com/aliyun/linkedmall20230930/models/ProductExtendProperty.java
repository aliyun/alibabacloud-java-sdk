// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductExtendProperty extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("value")
    public String value;

    public static ProductExtendProperty build(java.util.Map<String, ?> map) throws Exception {
        ProductExtendProperty self = new ProductExtendProperty();
        return TeaModel.build(map, self);
    }

    public ProductExtendProperty setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ProductExtendProperty setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
