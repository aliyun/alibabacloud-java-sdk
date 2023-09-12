// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSpec extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("keyId")
    public Long keyId;

    @NameInMap("value")
    public String value;

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

    public SkuSpec setValueId(Long valueId) {
        this.valueId = valueId;
        return this;
    }
    public Long getValueId() {
        return this.valueId;
    }

}
