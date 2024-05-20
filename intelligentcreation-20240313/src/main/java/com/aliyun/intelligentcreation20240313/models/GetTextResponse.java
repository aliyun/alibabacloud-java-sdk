// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextResult body;

    public static GetTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextResponse self = new GetTextResponse();
        return TeaModel.build(map, self);
    }

    public GetTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextResponse setBody(TextResult body) {
        this.body = body;
        return this;
    }
    public TextResult getBody() {
        return this.body;
    }

}
