// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpSoftwareCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIpSoftwareCopyrightResponseBody body;

    public static GetOcIpSoftwareCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpSoftwareCopyrightResponse self = new GetOcIpSoftwareCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIpSoftwareCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIpSoftwareCopyrightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIpSoftwareCopyrightResponse setBody(GetOcIpSoftwareCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIpSoftwareCopyrightResponseBody getBody() {
        return this.body;
    }

}
