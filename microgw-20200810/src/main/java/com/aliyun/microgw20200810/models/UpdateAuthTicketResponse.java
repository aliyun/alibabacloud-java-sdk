// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateAuthTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAuthTicketResponseBody body;

    public static UpdateAuthTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthTicketResponse self = new UpdateAuthTicketResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthTicketResponse setBody(UpdateAuthTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthTicketResponseBody getBody() {
        return this.body;
    }

}
