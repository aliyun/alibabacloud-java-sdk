// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ConfirmFabricConsortiumMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmFabricConsortiumMemberResponseBody body;

    public static ConfirmFabricConsortiumMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmFabricConsortiumMemberResponse self = new ConfirmFabricConsortiumMemberResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmFabricConsortiumMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmFabricConsortiumMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmFabricConsortiumMemberResponse setBody(ConfirmFabricConsortiumMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmFabricConsortiumMemberResponseBody getBody() {
        return this.body;
    }

}
