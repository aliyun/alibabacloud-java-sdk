// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ConfirmDisburseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmDisburseResult body;

    public static ConfirmDisburseResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseResponse self = new ConfirmDisburseResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmDisburseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmDisburseResponse setBody(ConfirmDisburseResult body) {
        this.body = body;
        return this;
    }
    public ConfirmDisburseResult getBody() {
        return this.body;
    }

}
