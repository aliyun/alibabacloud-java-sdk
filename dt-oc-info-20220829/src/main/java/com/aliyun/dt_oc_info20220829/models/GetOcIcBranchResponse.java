// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcBranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcBranchResponseBody body;

    public static GetOcIcBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcBranchResponse self = new GetOcIcBranchResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcBranchResponse setBody(GetOcIcBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcBranchResponseBody getBody() {
        return this.body;
    }

}
