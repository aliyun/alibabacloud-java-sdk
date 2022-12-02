// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInspectionTaskResponseBody body;

    public static GetInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionTaskResponse self = new GetInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInspectionTaskResponse setBody(GetInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
