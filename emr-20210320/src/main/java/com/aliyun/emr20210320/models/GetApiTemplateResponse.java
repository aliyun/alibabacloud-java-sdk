// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApiTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiTemplateResponseBody body;

    public static GetApiTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiTemplateResponse self = new GetApiTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetApiTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiTemplateResponse setBody(GetApiTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiTemplateResponseBody getBody() {
        return this.body;
    }

}
