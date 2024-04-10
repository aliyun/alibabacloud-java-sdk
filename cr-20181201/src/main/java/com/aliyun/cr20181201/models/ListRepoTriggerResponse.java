// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoTriggerResponseBody body;

    public static ListRepoTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTriggerResponse self = new ListRepoTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoTriggerResponse setBody(ListRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
