// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryTaskResponseBody body;

    public static CloudQueryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryTaskResponse self = new CloudQueryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryTaskResponse setBody(CloudQueryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryTaskResponseBody getBody() {
        return this.body;
    }

}
