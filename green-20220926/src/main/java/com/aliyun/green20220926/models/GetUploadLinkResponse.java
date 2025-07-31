// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadLinkResponseBody body;

    public static GetUploadLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadLinkResponse self = new GetUploadLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadLinkResponse setBody(GetUploadLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadLinkResponseBody getBody() {
        return this.body;
    }

}
