// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitModifyRefundWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitModifyRefundWithDesignatedTbUidResponseBody body;

    public static InitModifyRefundWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        InitModifyRefundWithDesignatedTbUidResponse self = new InitModifyRefundWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public InitModifyRefundWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitModifyRefundWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitModifyRefundWithDesignatedTbUidResponse setBody(InitModifyRefundWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public InitModifyRefundWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
