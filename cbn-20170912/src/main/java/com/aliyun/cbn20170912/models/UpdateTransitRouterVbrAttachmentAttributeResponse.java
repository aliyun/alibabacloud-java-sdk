// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVbrAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTransitRouterVbrAttachmentAttributeResponseBody body;

    public static UpdateTransitRouterVbrAttachmentAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVbrAttachmentAttributeResponse self = new UpdateTransitRouterVbrAttachmentAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVbrAttachmentAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterVbrAttachmentAttributeResponse setBody(UpdateTransitRouterVbrAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterVbrAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
