// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKgEntityResponseBody body;

    public static GetKgEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKgEntityResponse self = new GetKgEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetKgEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKgEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKgEntityResponse setBody(GetKgEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKgEntityResponseBody getBody() {
        return this.body;
    }

}
