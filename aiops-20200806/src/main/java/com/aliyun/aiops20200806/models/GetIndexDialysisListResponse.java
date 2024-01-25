// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexDialysisListResponseBody body;

    public static GetIndexDialysisListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisListResponse self = new GetIndexDialysisListResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexDialysisListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexDialysisListResponse setBody(GetIndexDialysisListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexDialysisListResponseBody getBody() {
        return this.body;
    }

}
