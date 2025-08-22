// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetApplicationProvisionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationProvisionInfoResponseBody body;

    public static GetApplicationProvisionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisionInfoResponse self = new GetApplicationProvisionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationProvisionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationProvisionInfoResponse setBody(GetApplicationProvisionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationProvisionInfoResponseBody getBody() {
        return this.body;
    }

}
