// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UmodelLabelFilter extends TeaModel {
    /**
     * <p>The key of the label used for filtering.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The logical operator used to compare the label\&quot;s value.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The value of the label to match.</p>
     */
    @NameInMap("value")
    public String value;

    public static UmodelLabelFilter build(java.util.Map<String, ?> map) throws Exception {
        UmodelLabelFilter self = new UmodelLabelFilter();
        return TeaModel.build(map, self);
    }

    public UmodelLabelFilter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UmodelLabelFilter setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UmodelLabelFilter setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
