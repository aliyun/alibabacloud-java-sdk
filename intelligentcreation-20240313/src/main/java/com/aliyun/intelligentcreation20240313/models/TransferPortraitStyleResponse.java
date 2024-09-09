// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TransferPortraitStyleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferPortraitStyleResponseBody body;

    public static TransferPortraitStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferPortraitStyleResponse self = new TransferPortraitStyleResponse();
        return TeaModel.build(map, self);
    }

    public TransferPortraitStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferPortraitStyleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferPortraitStyleResponse setBody(TransferPortraitStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferPortraitStyleResponseBody getBody() {
        return this.body;
    }

}
