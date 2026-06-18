// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListBranchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBranchesResponseBody body;

    public static ListBranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBranchesResponse self = new ListBranchesResponse();
        return TeaModel.build(map, self);
    }

    public ListBranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBranchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBranchesResponse setBody(ListBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBranchesResponseBody getBody() {
        return this.body;
    }

}
