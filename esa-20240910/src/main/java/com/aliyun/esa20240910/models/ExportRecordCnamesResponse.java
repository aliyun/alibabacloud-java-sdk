// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ExportRecordCnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportRecordCnamesResponseBody body;

    public static ExportRecordCnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordCnamesResponse self = new ExportRecordCnamesResponse();
        return TeaModel.build(map, self);
    }

    public ExportRecordCnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportRecordCnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportRecordCnamesResponse setBody(ExportRecordCnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportRecordCnamesResponseBody getBody() {
        return this.body;
    }

}
