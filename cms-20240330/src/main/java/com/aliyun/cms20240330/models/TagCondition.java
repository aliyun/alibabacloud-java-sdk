// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TagCondition extends TeaModel {
    /**
     * <p>The tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>env</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The operator.</p>
     * 
     * <strong>example:</strong>
     * <p>EQ</p>
     */
    @NameInMap("op")
    public String op;

    /**
     * <p>The tag value.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("value")
    public String value;

    public static TagCondition build(java.util.Map<String, ?> map) throws Exception {
        TagCondition self = new TagCondition();
        return TeaModel.build(map, self);
    }

    public TagCondition setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TagCondition setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public TagCondition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
