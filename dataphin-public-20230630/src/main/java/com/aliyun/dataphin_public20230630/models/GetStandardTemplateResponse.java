// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandardTemplateResponseBody body;

    public static GetStandardTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardTemplateResponse self = new GetStandardTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardTemplateResponse setBody(GetStandardTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardTemplateResponseBody getBody() {
        return this.body;
    }

}
