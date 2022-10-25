// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetMergeRequestApproveStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMergeRequestApproveStatusResponseBody body;

    public static GetMergeRequestApproveStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestApproveStatusResponse self = new GetMergeRequestApproveStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestApproveStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMergeRequestApproveStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMergeRequestApproveStatusResponse setBody(GetMergeRequestApproveStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMergeRequestApproveStatusResponseBody getBody() {
        return this.body;
    }

}
