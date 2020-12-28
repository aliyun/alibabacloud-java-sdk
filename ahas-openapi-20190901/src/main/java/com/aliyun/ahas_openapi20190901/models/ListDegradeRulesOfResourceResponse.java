// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListDegradeRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDegradeRulesOfResourceResponseBody body;

    public static ListDegradeRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDegradeRulesOfResourceResponse self = new ListDegradeRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListDegradeRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDegradeRulesOfResourceResponse setBody(ListDegradeRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDegradeRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
