// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimTaskDetailResponseBody body;

    public static GetBimTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimTaskDetailResponse self = new GetBimTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetBimTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimTaskDetailResponse setBody(GetBimTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimTaskDetailResponseBody getBody() {
        return this.body;
    }

}
