// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSpecValue extends TeaModel {
    @NameInMap("value")
    public String value;

    @NameInMap("valueId")
    public Long valueId;

    public static ProductSpecValue build(java.util.Map<String, ?> map) throws Exception {
        ProductSpecValue self = new ProductSpecValue();
        return TeaModel.build(map, self);
    }

    public ProductSpecValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ProductSpecValue setValueId(Long valueId) {
        this.valueId = valueId;
        return this;
    }
    public Long getValueId() {
        return this.valueId;
    }

}
