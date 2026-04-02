// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    /**
     * <p>The label key. The value can be up to 128 bytes in length and cannot contain equal signs (=) and commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>env</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The label value. The value can be up to 128 bytes in length and cannot contain equal signs (=) and commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Value")
    public String value;

    public static Label build(java.util.Map<String, ?> map) throws Exception {
        Label self = new Label();
        return TeaModel.build(map, self);
    }

    public Label setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Label setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
