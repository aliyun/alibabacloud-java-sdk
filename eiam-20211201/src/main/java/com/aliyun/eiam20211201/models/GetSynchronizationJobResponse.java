// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSynchronizationJobResponseBody body;

    public static GetSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSynchronizationJobResponse self = new GetSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public GetSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSynchronizationJobResponse setBody(GetSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
