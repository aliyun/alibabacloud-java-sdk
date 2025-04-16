// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class PAL7ConfigRewriteOp extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("OldValue")
    public String oldValue;

    /**
     * <strong>example:</strong>
     * <p>add,set,delete,replace</p>
     */
    @NameInMap("Op")
    public String op;

    @NameInMap("Value")
    public String value;

    @NameInMap("ValueVariable")
    public String valueVariable;

    public static PAL7ConfigRewriteOp build(java.util.Map<String, ?> map) throws Exception {
        PAL7ConfigRewriteOp self = new PAL7ConfigRewriteOp();
        return TeaModel.build(map, self);
    }

    public PAL7ConfigRewriteOp setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PAL7ConfigRewriteOp setOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }
    public String getOldValue() {
        return this.oldValue;
    }

    public PAL7ConfigRewriteOp setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public PAL7ConfigRewriteOp setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public PAL7ConfigRewriteOp setValueVariable(String valueVariable) {
        this.valueVariable = valueVariable;
        return this;
    }
    public String getValueVariable() {
        return this.valueVariable;
    }

}
