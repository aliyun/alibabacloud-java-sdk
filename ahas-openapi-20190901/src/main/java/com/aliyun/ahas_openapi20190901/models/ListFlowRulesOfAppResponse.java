// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListFlowRulesOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowRulesOfAppResponseBody body;

    public static ListFlowRulesOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesOfAppResponse self = new ListFlowRulesOfAppResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowRulesOfAppResponse setBody(ListFlowRulesOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowRulesOfAppResponseBody getBody() {
        return this.body;
    }

}
