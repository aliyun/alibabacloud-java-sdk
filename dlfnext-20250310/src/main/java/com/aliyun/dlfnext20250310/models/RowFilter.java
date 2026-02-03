// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class RowFilter extends TeaModel {
    @NameInMap("expression")
    public String expression;

    @NameInMap("predicate")
    public String predicate;

    public static RowFilter build(java.util.Map<String, ?> map) throws Exception {
        RowFilter self = new RowFilter();
        return TeaModel.build(map, self);
    }

    public RowFilter setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public RowFilter setPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }
    public String getPredicate() {
        return this.predicate;
    }

}
