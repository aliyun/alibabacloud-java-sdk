// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ConfirmDisburseWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmDisburseWithDesignatedTbUidResponseBody body;

    public static ConfirmDisburseWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseWithDesignatedTbUidResponse self = new ConfirmDisburseWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmDisburseWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmDisburseWithDesignatedTbUidResponse setBody(ConfirmDisburseWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmDisburseWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
