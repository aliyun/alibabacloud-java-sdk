// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkspaceMemberResponseBody body;

    public static ListWorkspaceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceMemberResponse self = new ListWorkspaceMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceMemberResponse setBody(ListWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
