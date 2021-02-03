// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDomainGroupResponseBody body;

    public static UpdateDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainGroupResponse self = new UpdateDomainGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainGroupResponse setBody(UpdateDomainGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainGroupResponseBody getBody() {
        return this.body;
    }

}
