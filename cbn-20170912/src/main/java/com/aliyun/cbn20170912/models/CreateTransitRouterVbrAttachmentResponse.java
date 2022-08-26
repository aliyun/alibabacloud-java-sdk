// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVbrAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransitRouterVbrAttachmentResponseBody body;

    public static CreateTransitRouterVbrAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVbrAttachmentResponse self = new CreateTransitRouterVbrAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVbrAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterVbrAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterVbrAttachmentResponse setBody(CreateTransitRouterVbrAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterVbrAttachmentResponseBody getBody() {
        return this.body;
    }

}
