// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class LabelDetail extends TeaModel {
    @NameInMap("key")
    public String key;

    @NameInMap("values")
    public java.util.List<String> values;

    public static LabelDetail build(java.util.Map<String, ?> map) throws Exception {
        LabelDetail self = new LabelDetail();
        return TeaModel.build(map, self);
    }

    public LabelDetail setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LabelDetail setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
