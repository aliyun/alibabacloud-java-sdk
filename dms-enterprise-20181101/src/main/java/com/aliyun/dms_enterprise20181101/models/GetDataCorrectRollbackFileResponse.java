// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectRollbackFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCorrectRollbackFileResponseBody body;

    public static GetDataCorrectRollbackFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectRollbackFileResponse self = new GetDataCorrectRollbackFileResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectRollbackFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCorrectRollbackFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCorrectRollbackFileResponse setBody(GetDataCorrectRollbackFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCorrectRollbackFileResponseBody getBody() {
        return this.body;
    }

}
