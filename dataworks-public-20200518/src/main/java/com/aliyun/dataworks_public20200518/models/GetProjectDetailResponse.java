// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectDetailResponseBody body;

    public static GetProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailResponse self = new GetProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectDetailResponse setBody(GetProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectDetailResponseBody getBody() {
        return this.body;
    }

}
