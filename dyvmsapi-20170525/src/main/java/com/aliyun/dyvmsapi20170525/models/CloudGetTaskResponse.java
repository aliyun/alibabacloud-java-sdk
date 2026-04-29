// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetTaskResponseBody body;

    public static CloudGetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetTaskResponse self = new CloudGetTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetTaskResponse setBody(CloudGetTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetTaskResponseBody getBody() {
        return this.body;
    }

}
