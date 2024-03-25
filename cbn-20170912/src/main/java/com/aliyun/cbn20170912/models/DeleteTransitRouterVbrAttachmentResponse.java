// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVbrAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterVbrAttachmentResponseBody body;

    public static DeleteTransitRouterVbrAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterVbrAttachmentResponse self = new DeleteTransitRouterVbrAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterVbrAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterVbrAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterVbrAttachmentResponse setBody(DeleteTransitRouterVbrAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterVbrAttachmentResponseBody getBody() {
        return this.body;
    }

}
