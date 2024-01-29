// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListCommitStatusesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommitStatusesResponseBody body;

    public static ListCommitStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommitStatusesResponse self = new ListCommitStatusesResponse();
        return TeaModel.build(map, self);
    }

    public ListCommitStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommitStatusesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommitStatusesResponse setBody(ListCommitStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommitStatusesResponseBody getBody() {
        return this.body;
    }

}
