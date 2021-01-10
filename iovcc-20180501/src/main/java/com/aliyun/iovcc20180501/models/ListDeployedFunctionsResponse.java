// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeployedFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployedFunctionsResponseBody body;

    public static ListDeployedFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployedFunctionsResponse self = new ListDeployedFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployedFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployedFunctionsResponse setBody(ListDeployedFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployedFunctionsResponseBody getBody() {
        return this.body;
    }

}
