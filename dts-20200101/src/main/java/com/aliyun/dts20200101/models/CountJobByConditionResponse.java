// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CountJobByConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountJobByConditionResponseBody body;

    public static CountJobByConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        CountJobByConditionResponse self = new CountJobByConditionResponse();
        return TeaModel.build(map, self);
    }

    public CountJobByConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountJobByConditionResponse setBody(CountJobByConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public CountJobByConditionResponseBody getBody() {
        return this.body;
    }

}
