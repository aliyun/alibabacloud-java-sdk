// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GroupCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GroupCallResponseBody body;

    public static GroupCallResponse build(java.util.Map<String, ?> map) throws Exception {
        GroupCallResponse self = new GroupCallResponse();
        return TeaModel.build(map, self);
    }

    public GroupCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GroupCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GroupCallResponse setBody(GroupCallResponseBody body) {
        this.body = body;
        return this;
    }
    public GroupCallResponseBody getBody() {
        return this.body;
    }

}
