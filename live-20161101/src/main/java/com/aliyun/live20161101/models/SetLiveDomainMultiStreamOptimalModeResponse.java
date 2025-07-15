// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamOptimalModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveDomainMultiStreamOptimalModeResponseBody body;

    public static SetLiveDomainMultiStreamOptimalModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamOptimalModeResponse self = new SetLiveDomainMultiStreamOptimalModeResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamOptimalModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveDomainMultiStreamOptimalModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveDomainMultiStreamOptimalModeResponse setBody(SetLiveDomainMultiStreamOptimalModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveDomainMultiStreamOptimalModeResponseBody getBody() {
        return this.body;
    }

}
