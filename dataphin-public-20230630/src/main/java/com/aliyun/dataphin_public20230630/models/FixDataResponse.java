// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class FixDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FixDataResponseBody body;

    public static FixDataResponse build(java.util.Map<String, ?> map) throws Exception {
        FixDataResponse self = new FixDataResponse();
        return TeaModel.build(map, self);
    }

    public FixDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FixDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FixDataResponse setBody(FixDataResponseBody body) {
        this.body = body;
        return this;
    }
    public FixDataResponseBody getBody() {
        return this.body;
    }

}
