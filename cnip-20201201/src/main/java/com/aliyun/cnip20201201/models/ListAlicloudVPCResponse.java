// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAlicloudVPCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlicloudVPCResponseBody body;

    public static ListAlicloudVPCResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlicloudVPCResponse self = new ListAlicloudVPCResponse();
        return TeaModel.build(map, self);
    }

    public ListAlicloudVPCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlicloudVPCResponse setBody(ListAlicloudVPCResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlicloudVPCResponseBody getBody() {
        return this.body;
    }

}
