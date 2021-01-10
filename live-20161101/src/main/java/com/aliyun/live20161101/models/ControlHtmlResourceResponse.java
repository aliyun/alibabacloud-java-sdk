// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ControlHtmlResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ControlHtmlResourceResponseBody body;

    public static ControlHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ControlHtmlResourceResponse self = new ControlHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public ControlHtmlResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ControlHtmlResourceResponse setBody(ControlHtmlResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ControlHtmlResourceResponseBody getBody() {
        return this.body;
    }

}
