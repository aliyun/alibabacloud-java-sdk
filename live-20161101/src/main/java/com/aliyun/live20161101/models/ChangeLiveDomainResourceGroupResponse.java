// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ChangeLiveDomainResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeLiveDomainResourceGroupResponseBody body;

    public static ChangeLiveDomainResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeLiveDomainResourceGroupResponse self = new ChangeLiveDomainResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ChangeLiveDomainResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeLiveDomainResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeLiveDomainResourceGroupResponse setBody(ChangeLiveDomainResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeLiveDomainResourceGroupResponseBody getBody() {
        return this.body;
    }

}
