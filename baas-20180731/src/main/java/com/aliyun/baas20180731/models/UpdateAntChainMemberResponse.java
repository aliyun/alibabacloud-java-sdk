// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAntChainMemberResponseBody body;

    public static UpdateAntChainMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainMemberResponse self = new UpdateAntChainMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntChainMemberResponse setBody(UpdateAntChainMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainMemberResponseBody getBody() {
        return this.body;
    }

}
