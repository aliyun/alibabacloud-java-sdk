// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UmodelEntityField extends TeaModel {
    /**
     * <p>The name of the entity field.</p>
     */
    @NameInMap("field")
    public String field;

    /**
     * <p>The field alias or display value.</p>
     */
    @NameInMap("value")
    public String value;

    public static UmodelEntityField build(java.util.Map<String, ?> map) throws Exception {
        UmodelEntityField self = new UmodelEntityField();
        return TeaModel.build(map, self);
    }

    public UmodelEntityField setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public UmodelEntityField setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
