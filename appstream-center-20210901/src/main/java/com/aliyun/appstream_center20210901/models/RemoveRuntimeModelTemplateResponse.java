// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RemoveRuntimeModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveRuntimeModelTemplateResponseBody body;

    public static RemoveRuntimeModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRuntimeModelTemplateResponse self = new RemoveRuntimeModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRuntimeModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRuntimeModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveRuntimeModelTemplateResponse setBody(RemoveRuntimeModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRuntimeModelTemplateResponseBody getBody() {
        return this.body;
    }

}
