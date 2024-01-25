// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetAppCodeForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAppCodeForInnerResponseBody body;

    public static ResetAppCodeForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeForInnerResponse self = new ResetAppCodeForInnerResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppCodeForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAppCodeForInnerResponse setBody(ResetAppCodeForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppCodeForInnerResponseBody getBody() {
        return this.body;
    }

}
