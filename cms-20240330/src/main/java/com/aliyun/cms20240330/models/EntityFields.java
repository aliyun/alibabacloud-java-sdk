// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EntityFields extends TeaModel {
    @NameInMap("field")
    public String field;

    @NameInMap("value")
    public String value;

    public static EntityFields build(java.util.Map<String, ?> map) throws Exception {
        EntityFields self = new EntityFields();
        return TeaModel.build(map, self);
    }

    public EntityFields setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public EntityFields setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
