// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetPhysicalSpaceTopoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhysicalSpaceTopoResponseBody body;

    public static GetPhysicalSpaceTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalSpaceTopoResponse self = new GetPhysicalSpaceTopoResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalSpaceTopoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalSpaceTopoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalSpaceTopoResponse setBody(GetPhysicalSpaceTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalSpaceTopoResponseBody getBody() {
        return this.body;
    }

}
