// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListFlowRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowRulesOfResourceResponseBody body;

    public static ListFlowRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesOfResourceResponse self = new ListFlowRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowRulesOfResourceResponse setBody(ListFlowRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
