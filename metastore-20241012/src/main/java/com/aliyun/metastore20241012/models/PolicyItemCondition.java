// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class PolicyItemCondition extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Values")
    public java.util.List<String> values;

    public static PolicyItemCondition build(java.util.Map<String, ?> map) throws Exception {
        PolicyItemCondition self = new PolicyItemCondition();
        return TeaModel.build(map, self);
    }

    public PolicyItemCondition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PolicyItemCondition setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
