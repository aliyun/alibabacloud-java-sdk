// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetGuidePageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGuidePageResponseBody body;

    public static GetGuidePageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGuidePageResponse self = new GetGuidePageResponse();
        return TeaModel.build(map, self);
    }

    public GetGuidePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGuidePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGuidePageResponse setBody(GetGuidePageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGuidePageResponseBody getBody() {
        return this.body;
    }

}
