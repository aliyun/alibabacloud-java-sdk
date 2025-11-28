// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllMemberResponseBody body;

    public static ListAllMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllMemberResponse self = new ListAllMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListAllMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllMemberResponse setBody(ListAllMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllMemberResponseBody getBody() {
        return this.body;
    }

}
