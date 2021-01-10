// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowTemplateResponseBody body;

    public static ListFlowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTemplateResponse self = new ListFlowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowTemplateResponse setBody(ListFlowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowTemplateResponseBody getBody() {
        return this.body;
    }

}
