// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCdnDomainStagingConfigResponseBody body;

    public static SetCdnDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainStagingConfigResponse self = new SetCdnDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCdnDomainStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCdnDomainStagingConfigResponse setBody(SetCdnDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
