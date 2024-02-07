// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSCIMSynchronizationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSCIMSynchronizationStatusResponseBody body;

    public static GetSCIMSynchronizationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSCIMSynchronizationStatusResponse self = new GetSCIMSynchronizationStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSCIMSynchronizationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSCIMSynchronizationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSCIMSynchronizationStatusResponse setBody(GetSCIMSynchronizationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSCIMSynchronizationStatusResponseBody getBody() {
        return this.body;
    }

}
