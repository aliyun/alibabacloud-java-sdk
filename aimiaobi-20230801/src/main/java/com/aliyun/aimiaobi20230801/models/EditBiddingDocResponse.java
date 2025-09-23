// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class EditBiddingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditBiddingDocResponseBody body;

    public static EditBiddingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        EditBiddingDocResponse self = new EditBiddingDocResponse();
        return TeaModel.build(map, self);
    }

    public EditBiddingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditBiddingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditBiddingDocResponse setBody(EditBiddingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public EditBiddingDocResponseBody getBody() {
        return this.body;
    }

}
