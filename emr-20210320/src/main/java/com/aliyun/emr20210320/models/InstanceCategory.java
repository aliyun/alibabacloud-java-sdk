// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class InstanceCategory extends TeaModel {
    /**
     * <p>默认值。</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("Keys")
    public java.util.List<String> keys;

    @NameInMap("Values")
    public java.util.List<String> values;

    public static InstanceCategory build(java.util.Map<String, ?> map) throws Exception {
        InstanceCategory self = new InstanceCategory();
        return TeaModel.build(map, self);
    }

    public InstanceCategory setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public InstanceCategory setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public InstanceCategory setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
