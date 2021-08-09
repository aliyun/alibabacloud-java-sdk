// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUserLicenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserLicenceResponseBody body;

    public static GetUserLicenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserLicenceResponse self = new GetUserLicenceResponse();
        return TeaModel.build(map, self);
    }

    public GetUserLicenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserLicenceResponse setBody(GetUserLicenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserLicenceResponseBody getBody() {
        return this.body;
    }

}
