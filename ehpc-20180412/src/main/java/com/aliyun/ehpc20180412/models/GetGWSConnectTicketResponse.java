// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetGWSConnectTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGWSConnectTicketResponseBody body;

    public static GetGWSConnectTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGWSConnectTicketResponse self = new GetGWSConnectTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetGWSConnectTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGWSConnectTicketResponse setBody(GetGWSConnectTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGWSConnectTicketResponseBody getBody() {
        return this.body;
    }

}
