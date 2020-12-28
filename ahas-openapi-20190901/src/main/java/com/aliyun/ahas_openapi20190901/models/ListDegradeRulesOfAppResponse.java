// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListDegradeRulesOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDegradeRulesOfAppResponseBody body;

    public static ListDegradeRulesOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDegradeRulesOfAppResponse self = new ListDegradeRulesOfAppResponse();
        return TeaModel.build(map, self);
    }

    public ListDegradeRulesOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDegradeRulesOfAppResponse setBody(ListDegradeRulesOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDegradeRulesOfAppResponseBody getBody() {
        return this.body;
    }

}
