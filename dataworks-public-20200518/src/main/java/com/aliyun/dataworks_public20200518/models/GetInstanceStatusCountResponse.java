// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceStatusCountResponseBody body;

    public static GetInstanceStatusCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusCountResponse self = new GetInstanceStatusCountResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceStatusCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceStatusCountResponse setBody(GetInstanceStatusCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceStatusCountResponseBody getBody() {
        return this.body;
    }

}
