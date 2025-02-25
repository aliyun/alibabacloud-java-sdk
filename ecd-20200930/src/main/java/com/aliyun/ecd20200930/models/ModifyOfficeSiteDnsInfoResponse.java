// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteDnsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOfficeSiteDnsInfoResponseBody body;

    public static ModifyOfficeSiteDnsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteDnsInfoResponse self = new ModifyOfficeSiteDnsInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteDnsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOfficeSiteDnsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOfficeSiteDnsInfoResponse setBody(ModifyOfficeSiteDnsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOfficeSiteDnsInfoResponseBody getBody() {
        return this.body;
    }

}
