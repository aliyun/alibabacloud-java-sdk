// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetZidTagByAtokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetZidTagByAtokenResponseBody body;

    public static GetZidTagByAtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetZidTagByAtokenResponse self = new GetZidTagByAtokenResponse();
        return TeaModel.build(map, self);
    }

    public GetZidTagByAtokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetZidTagByAtokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetZidTagByAtokenResponse setBody(GetZidTagByAtokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetZidTagByAtokenResponseBody getBody() {
        return this.body;
    }

}
