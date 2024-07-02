// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSpecValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>白色</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>秘色</p>
     */
    @NameInMap("valueAlias")
    public String valueAlias;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
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

    public ProductSpecValue setValueAlias(String valueAlias) {
        this.valueAlias = valueAlias;
        return this;
    }
    public String getValueAlias() {
        return this.valueAlias;
    }

    public ProductSpecValue setValueId(Long valueId) {
        this.valueId = valueId;
        return this;
    }
    public Long getValueId() {
        return this.valueId;
    }

}
