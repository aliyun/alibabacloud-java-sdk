// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class ClientReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClientReportResponseBody body;

    public static ClientReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ClientReportResponse self = new ClientReportResponse();
        return TeaModel.build(map, self);
    }

    public ClientReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClientReportResponse setBody(ClientReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ClientReportResponseBody getBody() {
        return this.body;
    }

}
