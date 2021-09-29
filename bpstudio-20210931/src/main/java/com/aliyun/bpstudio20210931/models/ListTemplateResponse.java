// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplateResponseBody body;

    public static ListTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateResponse self = new ListTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateResponse setBody(ListTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateResponseBody getBody() {
        return this.body;
    }

}
