// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QuotaListExportPagedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuotaListExportPagedResponseBody body;

    public static QuotaListExportPagedResponse build(java.util.Map<String, ?> map) throws Exception {
        QuotaListExportPagedResponse self = new QuotaListExportPagedResponse();
        return TeaModel.build(map, self);
    }

    public QuotaListExportPagedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuotaListExportPagedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuotaListExportPagedResponse setBody(QuotaListExportPagedResponseBody body) {
        this.body = body;
        return this;
    }
    public QuotaListExportPagedResponseBody getBody() {
        return this.body;
    }

}
