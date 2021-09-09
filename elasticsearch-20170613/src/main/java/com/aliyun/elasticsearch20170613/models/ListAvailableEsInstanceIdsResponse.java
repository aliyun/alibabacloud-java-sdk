// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAvailableEsInstanceIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableEsInstanceIdsResponseBody body;

    public static ListAvailableEsInstanceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEsInstanceIdsResponse self = new ListAvailableEsInstanceIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableEsInstanceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableEsInstanceIdsResponse setBody(ListAvailableEsInstanceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableEsInstanceIdsResponseBody getBody() {
        return this.body;
    }

}
