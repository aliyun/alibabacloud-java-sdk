// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenderOrderWithDesignatedTbUidResponseBody body;

    public static RenderOrderWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderWithDesignatedTbUidResponse self = new RenderOrderWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public RenderOrderWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderOrderWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenderOrderWithDesignatedTbUidResponse setBody(RenderOrderWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public RenderOrderWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
