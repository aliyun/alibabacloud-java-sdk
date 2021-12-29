// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllSystemContractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllSystemContractResponseBody body;

    public static ListAllSystemContractResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllSystemContractResponse self = new ListAllSystemContractResponse();
        return TeaModel.build(map, self);
    }

    public ListAllSystemContractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllSystemContractResponse setBody(ListAllSystemContractResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllSystemContractResponseBody getBody() {
        return this.body;
    }

}
