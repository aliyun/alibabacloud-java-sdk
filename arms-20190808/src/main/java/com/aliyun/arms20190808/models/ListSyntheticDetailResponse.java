// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSyntheticDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSyntheticDetailResponseBody body;

    public static ListSyntheticDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSyntheticDetailResponse self = new ListSyntheticDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListSyntheticDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSyntheticDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSyntheticDetailResponse setBody(ListSyntheticDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSyntheticDetailResponseBody getBody() {
        return this.body;
    }

}
