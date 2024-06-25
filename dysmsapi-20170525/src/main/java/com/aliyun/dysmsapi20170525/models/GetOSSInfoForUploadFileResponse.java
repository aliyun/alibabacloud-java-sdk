// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetOSSInfoForUploadFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOSSInfoForUploadFileResponseBody body;

    public static GetOSSInfoForUploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSInfoForUploadFileResponse self = new GetOSSInfoForUploadFileResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSInfoForUploadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSInfoForUploadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSInfoForUploadFileResponse setBody(GetOSSInfoForUploadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOSSInfoForUploadFileResponseBody getBody() {
        return this.body;
    }

}
