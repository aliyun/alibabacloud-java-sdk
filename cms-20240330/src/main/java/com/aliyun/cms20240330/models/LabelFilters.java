// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class LabelFilters extends TeaModel {
    /**
     * <p>The label name.</p>
     * 
     * <strong>example:</strong>
     * <p>env</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The label filter operator. Supported operators: = (equal to), != (not equal to), =~ (regular expression match), and !~ (regular expression not match).</p>
     * 
     * <strong>example:</strong>
     * <p>=</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The label value.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("value")
    public String value;

    public static LabelFilters build(java.util.Map<String, ?> map) throws Exception {
        LabelFilters self = new LabelFilters();
        return TeaModel.build(map, self);
    }

    public LabelFilters setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LabelFilters setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public LabelFilters setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
