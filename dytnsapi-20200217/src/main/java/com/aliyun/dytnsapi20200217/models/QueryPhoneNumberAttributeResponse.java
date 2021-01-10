// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneNumberAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPhoneNumberAttributeResponseBody body;

    public static QueryPhoneNumberAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNumberAttributeResponse self = new QueryPhoneNumberAttributeResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNumberAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneNumberAttributeResponse setBody(QueryPhoneNumberAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneNumberAttributeResponseBody getBody() {
        return this.body;
    }

}
