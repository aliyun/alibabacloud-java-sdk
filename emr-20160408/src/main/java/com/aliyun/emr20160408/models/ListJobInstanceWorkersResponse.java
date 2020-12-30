// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListJobInstanceWorkersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobInstanceWorkersResponseBody body;

    public static ListJobInstanceWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstanceWorkersResponse self = new ListJobInstanceWorkersResponse();
        return TeaModel.build(map, self);
    }

    public ListJobInstanceWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobInstanceWorkersResponse setBody(ListJobInstanceWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobInstanceWorkersResponseBody getBody() {
        return this.body;
    }

}
