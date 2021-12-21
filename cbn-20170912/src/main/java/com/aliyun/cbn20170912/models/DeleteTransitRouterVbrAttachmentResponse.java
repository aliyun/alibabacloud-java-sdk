// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVbrAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteTransitRouterVbrAttachmentResponse setBody(DeleteTransitRouterVbrAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterVbrAttachmentResponseBody getBody() {
        return this.body;
    }

}
