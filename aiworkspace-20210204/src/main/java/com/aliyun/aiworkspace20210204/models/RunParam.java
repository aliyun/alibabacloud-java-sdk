// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RunParam extends TeaModel {
    /**
     * <p>The parameter name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learning_rate</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The parameter value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.001</p>
     */
    @NameInMap("Value")
    public String value;

    public static RunParam build(java.util.Map<String, ?> map) throws Exception {
        RunParam self = new RunParam();
        return TeaModel.build(map, self);
    }

    public RunParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RunParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
