// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelRefundWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelRefundWithDesignatedTbUidResponseBody body;

    public static CancelRefundWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRefundWithDesignatedTbUidResponse self = new CancelRefundWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public CancelRefundWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRefundWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRefundWithDesignatedTbUidResponse setBody(CancelRefundWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRefundWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
