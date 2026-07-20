// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ColumnMask extends TeaModel {
    @NameInMap("expression")
    public String expression;

    @NameInMap("transform")
    public String transform;

    public static ColumnMask build(java.util.Map<String, ?> map) throws Exception {
        ColumnMask self = new ColumnMask();
        return TeaModel.build(map, self);
    }

    public ColumnMask setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public ColumnMask setTransform(String transform) {
        this.transform = transform;
        return this;
    }
    public String getTransform() {
        return this.transform;
    }

}
