// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportBillDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportBillDetailDataResponseBody body;

    public static ExportBillDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportBillDetailDataResponse self = new ExportBillDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportBillDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportBillDetailDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportBillDetailDataResponse setBody(ExportBillDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportBillDetailDataResponseBody getBody() {
        return this.body;
    }

}
