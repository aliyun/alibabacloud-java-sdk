// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApprovalTasksByUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApprovalTasksByUserResponseBody body;

    public static ListApprovalTasksByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalTasksByUserResponse self = new ListApprovalTasksByUserResponse();
        return TeaModel.build(map, self);
    }

    public ListApprovalTasksByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApprovalTasksByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApprovalTasksByUserResponse setBody(ListApprovalTasksByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApprovalTasksByUserResponseBody getBody() {
        return this.body;
    }

}
