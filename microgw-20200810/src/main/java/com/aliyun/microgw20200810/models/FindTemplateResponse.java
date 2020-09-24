// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindTemplateResponseBody body;

    public static FindTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        FindTemplateResponse self = new FindTemplateResponse();
        return TeaModel.build(map, self);
    }

    public FindTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindTemplateResponse setBody(FindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public FindTemplateResponseBody getBody() {
        return this.body;
    }

}
