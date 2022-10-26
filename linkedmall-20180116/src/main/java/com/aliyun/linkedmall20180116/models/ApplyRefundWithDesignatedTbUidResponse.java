// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyRefundWithDesignatedTbUidResponseBody body;

    public static ApplyRefundWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundWithDesignatedTbUidResponse self = new ApplyRefundWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRefundWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyRefundWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyRefundWithDesignatedTbUidResponse setBody(ApplyRefundWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyRefundWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
