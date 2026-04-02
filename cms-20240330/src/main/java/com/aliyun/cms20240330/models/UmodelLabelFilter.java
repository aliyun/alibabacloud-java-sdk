// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UmodelLabelFilter extends TeaModel {
    /**
     * <p>标签名</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>标签过滤操作符，仅支持 = 或 !=</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>标签值</p>
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
