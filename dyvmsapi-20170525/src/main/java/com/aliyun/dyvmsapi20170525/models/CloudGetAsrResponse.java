// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetAsrResponseBody body;

    public static CloudGetAsrResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAsrResponse self = new CloudGetAsrResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetAsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetAsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetAsrResponse setBody(CloudGetAsrResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetAsrResponseBody getBody() {
        return this.body;
    }

}
