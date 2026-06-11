// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UmodelEntityFilter extends TeaModel {
    /**
     * <p>The field name to filter on.</p>
     */
    @NameInMap("field")
    public String field;

    /**
     * <p>The comparison operator to use. Supported operators include <code>=</code>, <code>&gt;</code>, <code>&lt;</code>, <code>!=</code>, <code>IN</code>, and <code>NOT IN</code>.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The value to compare the field against.</p>
     */
    @NameInMap("value")
    public String value;

    public static UmodelEntityFilter build(java.util.Map<String, ?> map) throws Exception {
        UmodelEntityFilter self = new UmodelEntityFilter();
        return TeaModel.build(map, self);
    }

    public UmodelEntityFilter setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public UmodelEntityFilter setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UmodelEntityFilter setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
