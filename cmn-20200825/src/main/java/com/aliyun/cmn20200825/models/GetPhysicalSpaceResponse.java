// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetPhysicalSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhysicalSpaceResponseBody body;

    public static GetPhysicalSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalSpaceResponse self = new GetPhysicalSpaceResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalSpaceResponse setBody(GetPhysicalSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalSpaceResponseBody getBody() {
        return this.body;
    }

}
