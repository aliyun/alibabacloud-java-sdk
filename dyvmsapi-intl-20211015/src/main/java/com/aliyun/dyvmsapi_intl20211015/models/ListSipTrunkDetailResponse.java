// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListSipTrunkDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSipTrunkDetailResponseBody body;

    public static ListSipTrunkDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunkDetailResponse self = new ListSipTrunkDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListSipTrunkDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSipTrunkDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSipTrunkDetailResponse setBody(ListSipTrunkDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSipTrunkDetailResponseBody getBody() {
        return this.body;
    }

}
