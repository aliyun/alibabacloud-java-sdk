// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamLogContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStreamLogContentResponseBody body;

    public static GetStreamLogContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStreamLogContentResponse self = new GetStreamLogContentResponse();
        return TeaModel.build(map, self);
    }

    public GetStreamLogContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStreamLogContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStreamLogContentResponse setBody(GetStreamLogContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStreamLogContentResponseBody getBody() {
        return this.body;
    }

}
