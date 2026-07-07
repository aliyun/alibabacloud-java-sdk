// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSpec extends TeaModel {
    /**
     * <p>Specification key</p>
     * 
     * <strong>example:</strong>
     * <p>颜色分类</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>Specification ID</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("keyId")
    public Long keyId;

    /**
     * <p>Specification value</p>
     * 
     * <strong>example:</strong>
     * <p>天蓝色</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>Specification value alias (Recommendation: If this field is not empty (null), use its value as the frontend display specification; if this field is empty (null), use the value field as the frontend display specification.)</p>
     * 
     * <strong>example:</strong>
     * <p>秘色</p>
     */
    @NameInMap("valueAlias")
    public String valueAlias;

    /**
     * <p>Specification value ID</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("valueId")
    public Long valueId;

    public static SkuSpec build(java.util.Map<String, ?> map) throws Exception {
        SkuSpec self = new SkuSpec();
        return TeaModel.build(map, self);
    }

    public SkuSpec setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SkuSpec setKeyId(Long keyId) {
        this.keyId = keyId;
        return this;
    }
    public Long getKeyId() {
        return this.keyId;
    }

    public SkuSpec setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public SkuSpec setValueAlias(String valueAlias) {
        this.valueAlias = valueAlias;
        return this;
    }
    public String getValueAlias() {
        return this.valueAlias;
    }

    public SkuSpec setValueId(Long valueId) {
        this.valueId = valueId;
        return this;
    }
    public Long getValueId() {
        return this.valueId;
    }

}
