// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EntityFilters extends TeaModel {
    @NameInMap("field")
    public String field;

    @NameInMap("operator")
    public String operator;

    @NameInMap("value")
    public String value;

    public static EntityFilters build(java.util.Map<String, ?> map) throws Exception {
        EntityFilters self = new EntityFilters();
        return TeaModel.build(map, self);
    }

    public EntityFilters setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public EntityFilters setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public EntityFilters setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
