// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUsedPropertyValueResponseBody body;

    public static CheckUsedPropertyValueResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyValueResponse self = new CheckUsedPropertyValueResponse();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUsedPropertyValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUsedPropertyValueResponse setBody(CheckUsedPropertyValueResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUsedPropertyValueResponseBody getBody() {
        return this.body;
    }

}
