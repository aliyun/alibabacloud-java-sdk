// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class LabelFilters extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("operator")
    public String operator;

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
