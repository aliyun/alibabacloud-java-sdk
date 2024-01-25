// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class UpdateDomainToDomainGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainToDomainGroupResponseBody body;

    public static UpdateDomainToDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainToDomainGroupResponse self = new UpdateDomainToDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainToDomainGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainToDomainGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainToDomainGroupResponse setBody(UpdateDomainToDomainGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainToDomainGroupResponseBody getBody() {
        return this.body;
    }

}
