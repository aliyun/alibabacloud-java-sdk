// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformMatchToExpressionResponseBody extends TeaModel {
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformMatchToExpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformMatchToExpressionResponseBody self = new TransformMatchToExpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformMatchToExpressionResponseBody setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public TransformMatchToExpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
