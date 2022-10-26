// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitApplyRefundWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitApplyRefundWithDesignatedTbUidResponseBody body;

    public static InitApplyRefundWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefundWithDesignatedTbUidResponse self = new InitApplyRefundWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public InitApplyRefundWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitApplyRefundWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitApplyRefundWithDesignatedTbUidResponse setBody(InitApplyRefundWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public InitApplyRefundWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
