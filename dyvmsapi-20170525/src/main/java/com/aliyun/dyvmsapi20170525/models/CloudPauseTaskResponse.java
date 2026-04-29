// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudPauseTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudPauseTaskResponseBody body;

    public static CloudPauseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudPauseTaskResponse self = new CloudPauseTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloudPauseTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudPauseTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudPauseTaskResponse setBody(CloudPauseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudPauseTaskResponseBody getBody() {
        return this.body;
    }

}
