// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelOrderWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelOrderWithDesignatedTbUidResponseBody body;

    public static CancelOrderWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderWithDesignatedTbUidResponse self = new CancelOrderWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOrderWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOrderWithDesignatedTbUidResponse setBody(CancelOrderWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrderWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
