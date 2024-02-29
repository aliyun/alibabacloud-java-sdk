// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDISyncTaskResponseBody body;

    public static GetDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponse self = new GetDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDISyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDISyncTaskResponse setBody(GetDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
