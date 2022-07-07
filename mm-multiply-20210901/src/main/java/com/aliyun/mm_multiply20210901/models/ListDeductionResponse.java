// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListDeductionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeductionResponseBody body;

    public static ListDeductionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeductionResponse self = new ListDeductionResponse();
        return TeaModel.build(map, self);
    }

    public ListDeductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeductionResponse setBody(ListDeductionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeductionResponseBody getBody() {
        return this.body;
    }

}
