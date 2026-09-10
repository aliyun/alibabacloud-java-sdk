// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class FilterCondition extends TeaModel {
    /**
     * <p>The field name.</p>
     * 
     * <strong>example:</strong>
     * <p>region</p>
     */
    @NameInMap("field")
    public String field;

    /**
     * <p>The operator.</p>
     * 
     * <strong>example:</strong>
     * <p>EQ</p>
     */
    @NameInMap("op")
    public String op;

    /**
     * <p>The comparison value.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("value")
    public String value;

    public static FilterCondition build(java.util.Map<String, ?> map) throws Exception {
        FilterCondition self = new FilterCondition();
        return TeaModel.build(map, self);
    }

    public FilterCondition setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public FilterCondition setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public FilterCondition setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
