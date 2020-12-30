// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListRepoTriggerResponse setBody(ListRepoTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoTriggerResponseBody getBody() {
        return this.body;
    }

}
