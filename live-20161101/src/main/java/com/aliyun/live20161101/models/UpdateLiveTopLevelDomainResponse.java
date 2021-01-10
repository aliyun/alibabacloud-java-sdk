// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveTopLevelDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveTopLevelDomainResponseBody body;

    public static UpdateLiveTopLevelDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTopLevelDomainResponse self = new UpdateLiveTopLevelDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTopLevelDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveTopLevelDomainResponse setBody(UpdateLiveTopLevelDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveTopLevelDomainResponseBody getBody() {
        return this.body;
    }

}
