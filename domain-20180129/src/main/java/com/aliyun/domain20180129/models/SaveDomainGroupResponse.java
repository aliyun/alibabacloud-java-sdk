// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveDomainGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveDomainGroupResponseBody body;

    public static SaveDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDomainGroupResponse self = new SaveDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public SaveDomainGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDomainGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveDomainGroupResponse setBody(SaveDomainGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDomainGroupResponseBody getBody() {
        return this.body;
    }

}
