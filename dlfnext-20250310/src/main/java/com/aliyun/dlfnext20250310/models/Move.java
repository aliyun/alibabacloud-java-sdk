// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Move extends TeaModel {
    @NameInMap("fieldName")
    public String fieldName;

    @NameInMap("referenceFieldName")
    public String referenceFieldName;

    @NameInMap("type")
    public String type;

    public static Move build(java.util.Map<String, ?> map) throws Exception {
        Move self = new Move();
        return TeaModel.build(map, self);
    }

    public Move setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public Move setReferenceFieldName(String referenceFieldName) {
        this.referenceFieldName = referenceFieldName;
        return this;
    }
    public String getReferenceFieldName() {
        return this.referenceFieldName;
    }

    public Move setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
