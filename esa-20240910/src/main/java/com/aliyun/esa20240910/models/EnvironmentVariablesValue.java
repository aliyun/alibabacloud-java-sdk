// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EnvironmentVariablesValue extends TeaModel {
    /**
     * <p>The environment variable type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>plain_text</code>: plain text</li>
     * <li><code>secret_text</code>: encrypted text</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>plain_text</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The environment variable value.</p>
     * 
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("Value")
    public String value;

    public static EnvironmentVariablesValue build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentVariablesValue self = new EnvironmentVariablesValue();
        return TeaModel.build(map, self);
    }

    public EnvironmentVariablesValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EnvironmentVariablesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
