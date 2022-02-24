// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetSoftCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSoftCopyrightResponseBody body;

    public static GetSoftCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSoftCopyrightResponse self = new GetSoftCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public GetSoftCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSoftCopyrightResponse setBody(GetSoftCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSoftCopyrightResponseBody getBody() {
        return this.body;
    }

}
