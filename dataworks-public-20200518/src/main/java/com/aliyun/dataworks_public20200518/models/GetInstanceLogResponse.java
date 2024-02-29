// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceLogResponseBody body;

    public static GetInstanceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogResponse self = new GetInstanceLogResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceLogResponse setBody(GetInstanceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceLogResponseBody getBody() {
        return this.body;
    }

}
