// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBaaSFabricConsortiumResponseBody body;

    public static ListBaaSFabricConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricConsortiumResponse self = new ListBaaSFabricConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaaSFabricConsortiumResponse setBody(ListBaaSFabricConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSFabricConsortiumResponseBody getBody() {
        return this.body;
    }

}
