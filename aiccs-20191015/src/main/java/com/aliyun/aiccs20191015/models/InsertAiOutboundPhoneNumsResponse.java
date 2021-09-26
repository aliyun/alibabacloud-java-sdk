// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertAiOutboundPhoneNumsResponseBody body;

    public static InsertAiOutboundPhoneNumsResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsResponse self = new InsertAiOutboundPhoneNumsResponse();
        return TeaModel.build(map, self);
    }

    public InsertAiOutboundPhoneNumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertAiOutboundPhoneNumsResponse setBody(InsertAiOutboundPhoneNumsResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertAiOutboundPhoneNumsResponseBody getBody() {
        return this.body;
    }

}
