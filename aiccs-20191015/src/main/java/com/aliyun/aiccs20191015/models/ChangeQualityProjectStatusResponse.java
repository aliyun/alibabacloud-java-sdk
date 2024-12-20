// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ChangeQualityProjectStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeQualityProjectStatusResponseBody body;

    public static ChangeQualityProjectStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeQualityProjectStatusResponse self = new ChangeQualityProjectStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeQualityProjectStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeQualityProjectStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeQualityProjectStatusResponse setBody(ChangeQualityProjectStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeQualityProjectStatusResponseBody getBody() {
        return this.body;
    }

}
