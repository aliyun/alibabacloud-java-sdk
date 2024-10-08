// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ExportRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportRecordsResponseBody body;

    public static ExportRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordsResponse self = new ExportRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ExportRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportRecordsResponse setBody(ExportRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportRecordsResponseBody getBody() {
        return this.body;
    }

}
