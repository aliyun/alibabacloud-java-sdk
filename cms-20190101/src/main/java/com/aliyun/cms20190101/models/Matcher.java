// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class Matcher extends TeaModel {
    @NameInMap("Label")
    public String label;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Value")
    public String value;

    public static Matcher build(java.util.Map<String, ?> map) throws Exception {
        Matcher self = new Matcher();
        return TeaModel.build(map, self);
    }

    public Matcher setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public Matcher setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Matcher setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
