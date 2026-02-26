// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductProperty extends TeaModel {
    @NameInMap("text")
    public String text;

    @NameInMap("values")
    public java.util.List<String> values;

    public static ProductProperty build(java.util.Map<String, ?> map) throws Exception {
        ProductProperty self = new ProductProperty();
        return TeaModel.build(map, self);
    }

    public ProductProperty setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ProductProperty setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
