// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBindingsResponseBody extends TeaModel {
    @NameInMap("Bindings")
    public java.util.List<Binding> bindings;

    /**
     * <strong>example:</strong>
     * <p>immtest:dataset001:examplebucket01</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>EFDFD356-C928-4A36-951A-6EB5A592****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsResponseBody self = new ListBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingsResponseBody setBindings(java.util.List<Binding> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<Binding> getBindings() {
        return this.bindings;
    }

    public ListBindingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
