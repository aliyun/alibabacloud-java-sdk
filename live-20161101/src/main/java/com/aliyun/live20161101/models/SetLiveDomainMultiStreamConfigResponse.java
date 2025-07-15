// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveDomainMultiStreamConfigResponseBody body;

    public static SetLiveDomainMultiStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamConfigResponse self = new SetLiveDomainMultiStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveDomainMultiStreamConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveDomainMultiStreamConfigResponse setBody(SetLiveDomainMultiStreamConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveDomainMultiStreamConfigResponseBody getBody() {
        return this.body;
    }

}
