// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemTimeTypeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkitemTimeTypeListResponseBody body;

    public static GetWorkitemTimeTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemTimeTypeListResponse self = new GetWorkitemTimeTypeListResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkitemTimeTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkitemTimeTypeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkitemTimeTypeListResponse setBody(GetWorkitemTimeTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkitemTimeTypeListResponseBody getBody() {
        return this.body;
    }

}
