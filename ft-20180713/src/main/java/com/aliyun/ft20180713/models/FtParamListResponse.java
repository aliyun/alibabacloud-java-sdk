// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtParamListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FtParamListResponseBody body;

    public static FtParamListResponse build(java.util.Map<String, ?> map) throws Exception {
        FtParamListResponse self = new FtParamListResponse();
        return TeaModel.build(map, self);
    }

    public FtParamListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtParamListResponse setBody(FtParamListResponseBody body) {
        this.body = body;
        return this;
    }
    public FtParamListResponseBody getBody() {
        return this.body;
    }

}
