// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateAsrResponseBody body;

    public static CloudCreateAsrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAsrResponse self = new CloudCreateAsrResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateAsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateAsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateAsrResponse setBody(CloudCreateAsrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateAsrResponseBody getBody() {
        return this.body;
    }

}
