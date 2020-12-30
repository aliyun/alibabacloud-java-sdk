// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateDomainTrackNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDomainTrackNameResponseBody body;

    public static UpdateDomainTrackNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainTrackNameResponse self = new UpdateDomainTrackNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainTrackNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainTrackNameResponse setBody(UpdateDomainTrackNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainTrackNameResponseBody getBody() {
        return this.body;
    }

}
