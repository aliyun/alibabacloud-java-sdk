// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListIsolationRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIsolationRulesOfResourceResponseBody body;

    public static ListIsolationRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIsolationRulesOfResourceResponse self = new ListIsolationRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListIsolationRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIsolationRulesOfResourceResponse setBody(ListIsolationRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIsolationRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
