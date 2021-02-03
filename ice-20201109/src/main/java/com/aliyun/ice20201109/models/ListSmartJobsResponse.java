// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmartJobsResponseBody body;

    public static ListSmartJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartJobsResponse self = new ListSmartJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartJobsResponse setBody(ListSmartJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartJobsResponseBody getBody() {
        return this.body;
    }

}
