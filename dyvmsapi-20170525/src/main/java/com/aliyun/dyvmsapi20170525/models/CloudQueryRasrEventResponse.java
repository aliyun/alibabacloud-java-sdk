// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryRasrEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryRasrEventResponseBody body;

    public static CloudQueryRasrEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryRasrEventResponse self = new CloudQueryRasrEventResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryRasrEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryRasrEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryRasrEventResponse setBody(CloudQueryRasrEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryRasrEventResponseBody getBody() {
        return this.body;
    }

}
