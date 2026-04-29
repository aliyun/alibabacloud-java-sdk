// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListCurlLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListCurlLogResponseBody body;

    public static CloudListCurlLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListCurlLogResponse self = new CloudListCurlLogResponse();
        return TeaModel.build(map, self);
    }

    public CloudListCurlLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListCurlLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListCurlLogResponse setBody(CloudListCurlLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListCurlLogResponseBody getBody() {
        return this.body;
    }

}
