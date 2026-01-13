// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListSubAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubAccountInfoResult body;

    public static ListSubAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubAccountInfoResponse self = new ListSubAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListSubAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubAccountInfoResponse setBody(ListSubAccountInfoResult body) {
        this.body = body;
        return this;
    }
    public ListSubAccountInfoResult getBody() {
        return this.body;
    }

}
