// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class WaitApplyInvoiceTaskDetailQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WaitApplyInvoiceTaskDetailQueryResponseBody body;

    public static WaitApplyInvoiceTaskDetailQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        WaitApplyInvoiceTaskDetailQueryResponse self = new WaitApplyInvoiceTaskDetailQueryResponse();
        return TeaModel.build(map, self);
    }

    public WaitApplyInvoiceTaskDetailQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WaitApplyInvoiceTaskDetailQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WaitApplyInvoiceTaskDetailQueryResponse setBody(WaitApplyInvoiceTaskDetailQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public WaitApplyInvoiceTaskDetailQueryResponseBody getBody() {
        return this.body;
    }

}
