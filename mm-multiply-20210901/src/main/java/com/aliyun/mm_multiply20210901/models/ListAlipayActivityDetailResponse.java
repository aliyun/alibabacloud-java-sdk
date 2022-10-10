// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListAlipayActivityDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlipayActivityDetailResponseBody body;

    public static ListAlipayActivityDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlipayActivityDetailResponse self = new ListAlipayActivityDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListAlipayActivityDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlipayActivityDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlipayActivityDetailResponse setBody(ListAlipayActivityDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlipayActivityDetailResponseBody getBody() {
        return this.body;
    }

}
