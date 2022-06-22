// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CancelInspectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelInspectionResponseBody body;

    public static CancelInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelInspectionResponse self = new CancelInspectionResponse();
        return TeaModel.build(map, self);
    }

    public CancelInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelInspectionResponse setBody(CancelInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelInspectionResponseBody getBody() {
        return this.body;
    }

}
