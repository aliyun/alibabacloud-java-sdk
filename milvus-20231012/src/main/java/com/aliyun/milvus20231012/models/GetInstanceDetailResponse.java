// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class GetInstanceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceDetailResponseBody body;

    public static GetInstanceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDetailResponse self = new GetInstanceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceDetailResponse setBody(GetInstanceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceDetailResponseBody getBody() {
        return this.body;
    }

}
