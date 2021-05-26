// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTicketResponseBody body;

    public static UpdateTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketResponse self = new UpdateTicketResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketResponse setBody(UpdateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketResponseBody getBody() {
        return this.body;
    }

}
