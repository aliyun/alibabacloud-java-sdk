// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVbrAttachmentAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateTransitRouterVbrAttachmentAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterVbrAttachmentAttributeResponse setBody(UpdateTransitRouterVbrAttachmentAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterVbrAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

}
