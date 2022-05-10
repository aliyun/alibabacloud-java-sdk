// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimDrawingDetailResponseBody body;

    public static GetBimDrawingDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingDetailResponse self = new GetBimDrawingDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimDrawingDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimDrawingDetailResponse setBody(GetBimDrawingDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimDrawingDetailResponseBody getBody() {
        return this.body;
    }

}
