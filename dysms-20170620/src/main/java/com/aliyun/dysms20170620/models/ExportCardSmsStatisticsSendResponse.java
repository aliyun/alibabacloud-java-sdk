// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsStatisticsSendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCardSmsStatisticsSendResponseBody body;

    public static ExportCardSmsStatisticsSendResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsStatisticsSendResponse self = new ExportCardSmsStatisticsSendResponse();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsStatisticsSendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCardSmsStatisticsSendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCardSmsStatisticsSendResponse setBody(ExportCardSmsStatisticsSendResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCardSmsStatisticsSendResponseBody getBody() {
        return this.body;
    }

}
