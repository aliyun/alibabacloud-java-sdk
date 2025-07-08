// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCardSmsHistoryResponseBody body;

    public static ExportCardSmsHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsHistoryResponse self = new ExportCardSmsHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCardSmsHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCardSmsHistoryResponse setBody(ExportCardSmsHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCardSmsHistoryResponseBody getBody() {
        return this.body;
    }

}
