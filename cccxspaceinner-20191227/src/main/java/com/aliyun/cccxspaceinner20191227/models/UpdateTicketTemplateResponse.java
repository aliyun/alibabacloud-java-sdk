// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateTicketTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTicketTemplateResponseBody body;

    public static UpdateTicketTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketTemplateResponse self = new UpdateTicketTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketTemplateResponse setBody(UpdateTicketTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketTemplateResponseBody getBody() {
        return this.body;
    }

}
