// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DetachGadInstanceDbMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachGadInstanceDbMemberResponseBody body;

    public static DetachGadInstanceDbMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachGadInstanceDbMemberResponse self = new DetachGadInstanceDbMemberResponse();
        return TeaModel.build(map, self);
    }

    public DetachGadInstanceDbMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachGadInstanceDbMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachGadInstanceDbMemberResponse setBody(DetachGadInstanceDbMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachGadInstanceDbMemberResponseBody getBody() {
        return this.body;
    }

}
