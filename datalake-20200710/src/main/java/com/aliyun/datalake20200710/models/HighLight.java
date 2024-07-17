// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class HighLight extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p><em>tab</em>2</p>
     */
    @NameInMap("Value")
    public String value;

    public static HighLight build(java.util.Map<String, ?> map) throws Exception {
        HighLight self = new HighLight();
        return TeaModel.build(map, self);
    }

    public HighLight setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public HighLight setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
