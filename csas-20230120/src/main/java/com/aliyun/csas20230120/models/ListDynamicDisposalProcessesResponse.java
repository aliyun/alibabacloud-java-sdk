// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicDisposalProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDynamicDisposalProcessesResponseBody body;

    public static ListDynamicDisposalProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicDisposalProcessesResponse self = new ListDynamicDisposalProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ListDynamicDisposalProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDynamicDisposalProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDynamicDisposalProcessesResponse setBody(ListDynamicDisposalProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicDisposalProcessesResponseBody getBody() {
        return this.body;
    }

}
