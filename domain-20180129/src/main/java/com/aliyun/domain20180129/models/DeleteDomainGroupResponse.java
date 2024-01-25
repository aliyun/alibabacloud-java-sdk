// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteDomainGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDomainGroupResponseBody body;

    public static DeleteDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainGroupResponse self = new DeleteDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainGroupResponse setBody(DeleteDomainGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainGroupResponseBody getBody() {
        return this.body;
    }

}
