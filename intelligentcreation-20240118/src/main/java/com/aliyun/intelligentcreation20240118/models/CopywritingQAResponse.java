// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class CopywritingQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopywritingQAResponseBody body;

    public static CopywritingQAResponse build(java.util.Map<String, ?> map) throws Exception {
        CopywritingQAResponse self = new CopywritingQAResponse();
        return TeaModel.build(map, self);
    }

    public CopywritingQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopywritingQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopywritingQAResponse setBody(CopywritingQAResponseBody body) {
        this.body = body;
        return this;
    }
    public CopywritingQAResponseBody getBody() {
        return this.body;
    }

}
