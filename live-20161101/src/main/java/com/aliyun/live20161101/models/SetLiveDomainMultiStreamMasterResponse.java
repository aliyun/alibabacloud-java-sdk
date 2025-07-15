// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamMasterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveDomainMultiStreamMasterResponseBody body;

    public static SetLiveDomainMultiStreamMasterResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamMasterResponse self = new SetLiveDomainMultiStreamMasterResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamMasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveDomainMultiStreamMasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveDomainMultiStreamMasterResponse setBody(SetLiveDomainMultiStreamMasterResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveDomainMultiStreamMasterResponseBody getBody() {
        return this.body;
    }

}
