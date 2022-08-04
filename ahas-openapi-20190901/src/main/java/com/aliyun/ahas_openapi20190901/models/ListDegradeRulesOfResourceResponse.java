// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListDegradeRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public ListDegradeRulesOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDegradeRulesOfResourceResponse setBody(ListDegradeRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDegradeRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
