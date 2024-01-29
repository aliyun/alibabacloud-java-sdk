// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestcaseListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTestcaseListResponseBody body;

    public static GetTestcaseListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTestcaseListResponse self = new GetTestcaseListResponse();
        return TeaModel.build(map, self);
    }

    public GetTestcaseListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTestcaseListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTestcaseListResponse setBody(GetTestcaseListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTestcaseListResponseBody getBody() {
        return this.body;
    }

}
