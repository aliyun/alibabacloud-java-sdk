// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetProjectPhaseDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectPhaseDetailResponseBody body;

    public static GetProjectPhaseDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectPhaseDetailResponse self = new GetProjectPhaseDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectPhaseDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectPhaseDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectPhaseDetailResponse setBody(GetProjectPhaseDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectPhaseDetailResponseBody getBody() {
        return this.body;
    }

}
