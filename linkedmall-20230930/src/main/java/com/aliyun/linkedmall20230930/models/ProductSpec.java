// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>颜色分类</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("keyId")
    public Long keyId;

    @NameInMap("values")
    public java.util.List<ProductSpecValue> values;

    public static ProductSpec build(java.util.Map<String, ?> map) throws Exception {
        ProductSpec self = new ProductSpec();
        return TeaModel.build(map, self);
    }

    public ProductSpec setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ProductSpec setKeyId(Long keyId) {
        this.keyId = keyId;
        return this;
    }
    public Long getKeyId() {
        return this.keyId;
    }

    public ProductSpec setValues(java.util.List<ProductSpecValue> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ProductSpecValue> getValues() {
        return this.values;
    }

}
