// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetRecordUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudGetRecordUrlResponseBody body;

    public static CloudGetRecordUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudGetRecordUrlResponse self = new CloudGetRecordUrlResponse();
        return TeaModel.build(map, self);
    }

    public CloudGetRecordUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudGetRecordUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudGetRecordUrlResponse setBody(CloudGetRecordUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudGetRecordUrlResponseBody getBody() {
        return this.body;
    }

}
