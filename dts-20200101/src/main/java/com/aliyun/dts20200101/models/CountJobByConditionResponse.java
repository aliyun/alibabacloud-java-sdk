// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CountJobByConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CountJobByConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountJobByConditionResponse setBody(CountJobByConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public CountJobByConditionResponseBody getBody() {
        return this.body;
    }

}
