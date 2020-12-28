// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListIsolationRulesOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIsolationRulesOfAppResponseBody body;

    public static ListIsolationRulesOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIsolationRulesOfAppResponse self = new ListIsolationRulesOfAppResponse();
        return TeaModel.build(map, self);
    }

    public ListIsolationRulesOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIsolationRulesOfAppResponse setBody(ListIsolationRulesOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIsolationRulesOfAppResponseBody getBody() {
        return this.body;
    }

}
