// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class OperateCallCenterForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateCallCenterForPartnerResponseBody body;

    public static OperateCallCenterForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateCallCenterForPartnerResponse self = new OperateCallCenterForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public OperateCallCenterForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateCallCenterForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateCallCenterForPartnerResponse setBody(OperateCallCenterForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateCallCenterForPartnerResponseBody getBody() {
        return this.body;
    }

}
