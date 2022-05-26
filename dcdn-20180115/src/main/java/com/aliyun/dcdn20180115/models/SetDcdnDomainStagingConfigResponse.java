// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDcdnDomainStagingConfigResponseBody body;

    public static SetDcdnDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainStagingConfigResponse self = new SetDcdnDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnDomainStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnDomainStagingConfigResponse setBody(SetDcdnDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
