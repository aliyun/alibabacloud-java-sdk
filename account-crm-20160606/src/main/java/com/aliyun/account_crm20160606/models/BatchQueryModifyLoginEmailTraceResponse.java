// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryModifyLoginEmailTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchQueryModifyLoginEmailTraceResponseBody body;

    public static BatchQueryModifyLoginEmailTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryModifyLoginEmailTraceResponse self = new BatchQueryModifyLoginEmailTraceResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryModifyLoginEmailTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryModifyLoginEmailTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryModifyLoginEmailTraceResponse setBody(BatchQueryModifyLoginEmailTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryModifyLoginEmailTraceResponseBody getBody() {
        return this.body;
    }

}
