// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListApplyLinkMicUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplyLinkMicUsersResponseBody body;

    public static ListApplyLinkMicUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplyLinkMicUsersResponse self = new ListApplyLinkMicUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListApplyLinkMicUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplyLinkMicUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplyLinkMicUsersResponse setBody(ListApplyLinkMicUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplyLinkMicUsersResponseBody getBody() {
        return this.body;
    }

}
