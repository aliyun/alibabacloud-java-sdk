// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetCommonLogDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommonLogDetailResponseBody body;

    public static GetCommonLogDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommonLogDetailResponse self = new GetCommonLogDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCommonLogDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommonLogDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommonLogDetailResponse setBody(GetCommonLogDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommonLogDetailResponseBody getBody() {
        return this.body;
    }

}
