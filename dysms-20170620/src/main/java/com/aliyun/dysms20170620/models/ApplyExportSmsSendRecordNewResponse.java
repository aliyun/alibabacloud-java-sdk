// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ApplyExportSmsSendRecordNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyExportSmsSendRecordNewResponseBody body;

    public static ApplyExportSmsSendRecordNewResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyExportSmsSendRecordNewResponse self = new ApplyExportSmsSendRecordNewResponse();
        return TeaModel.build(map, self);
    }

    public ApplyExportSmsSendRecordNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyExportSmsSendRecordNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyExportSmsSendRecordNewResponse setBody(ApplyExportSmsSendRecordNewResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyExportSmsSendRecordNewResponseBody getBody() {
        return this.body;
    }

}
