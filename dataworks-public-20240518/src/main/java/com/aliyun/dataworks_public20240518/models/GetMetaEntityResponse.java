// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaEntityResponseBody body;

    public static GetMetaEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaEntityResponse self = new GetMetaEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaEntityResponse setBody(GetMetaEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaEntityResponseBody getBody() {
        return this.body;
    }

}
