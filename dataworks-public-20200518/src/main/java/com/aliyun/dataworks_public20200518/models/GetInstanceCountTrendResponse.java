// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceCountTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceCountTrendResponseBody body;

    public static GetInstanceCountTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountTrendResponse self = new GetInstanceCountTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceCountTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceCountTrendResponse setBody(GetInstanceCountTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceCountTrendResponseBody getBody() {
        return this.body;
    }

}
