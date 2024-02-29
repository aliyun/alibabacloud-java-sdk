// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelRecycleBinJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRecycleBinJobResponseBody body;

    public static CancelRecycleBinJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRecycleBinJobResponse self = new CancelRecycleBinJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelRecycleBinJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRecycleBinJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRecycleBinJobResponse setBody(CancelRecycleBinJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRecycleBinJobResponseBody getBody() {
        return this.body;
    }

}
