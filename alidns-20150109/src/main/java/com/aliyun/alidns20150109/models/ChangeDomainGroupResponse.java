// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeDomainGroupResponseBody body;

    public static ChangeDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainGroupResponse self = new ChangeDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDomainGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDomainGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDomainGroupResponse setBody(ChangeDomainGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDomainGroupResponseBody getBody() {
        return this.body;
    }

}
