// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveDomainStagingConfigResponseBody body;

    public static SetLiveDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainStagingConfigResponse self = new SetLiveDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveDomainStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveDomainStagingConfigResponse setBody(SetLiveDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
