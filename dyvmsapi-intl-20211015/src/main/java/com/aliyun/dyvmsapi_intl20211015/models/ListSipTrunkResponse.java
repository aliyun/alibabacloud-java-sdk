// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListSipTrunkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSipTrunkResponseBody body;

    public static ListSipTrunkResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunkResponse self = new ListSipTrunkResponse();
        return TeaModel.build(map, self);
    }

    public ListSipTrunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSipTrunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSipTrunkResponse setBody(ListSipTrunkResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSipTrunkResponseBody getBody() {
        return this.body;
    }

}
