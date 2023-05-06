// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditNewBuyStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditNewBuyStatusResponseBody body;

    public static EditNewBuyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        EditNewBuyStatusResponse self = new EditNewBuyStatusResponse();
        return TeaModel.build(map, self);
    }

    public EditNewBuyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditNewBuyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditNewBuyStatusResponse setBody(EditNewBuyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public EditNewBuyStatusResponseBody getBody() {
        return this.body;
    }

}
