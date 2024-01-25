// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisArrayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexDialysisArrayResponseBody body;

    public static GetIndexDialysisArrayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisArrayResponse self = new GetIndexDialysisArrayResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisArrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexDialysisArrayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexDialysisArrayResponse setBody(GetIndexDialysisArrayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexDialysisArrayResponseBody getBody() {
        return this.body;
    }

}
