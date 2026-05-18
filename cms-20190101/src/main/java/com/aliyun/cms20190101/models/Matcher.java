// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class Matcher extends TeaModel {
    /**
     * <p>The name of the metric dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>i-fewrewr*****</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The matching mode of the metric dimension. Only EQUALS is supported. Default value: EQUALS.</p>
     * 
     * <strong>example:</strong>
     * <p>EQUALS</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The value of the metric dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
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
