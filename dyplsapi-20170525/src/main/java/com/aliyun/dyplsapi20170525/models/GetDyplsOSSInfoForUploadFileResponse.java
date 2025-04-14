// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetDyplsOSSInfoForUploadFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDyplsOSSInfoForUploadFileResponseBody body;

    public static GetDyplsOSSInfoForUploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDyplsOSSInfoForUploadFileResponse self = new GetDyplsOSSInfoForUploadFileResponse();
        return TeaModel.build(map, self);
    }

    public GetDyplsOSSInfoForUploadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDyplsOSSInfoForUploadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDyplsOSSInfoForUploadFileResponse setBody(GetDyplsOSSInfoForUploadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDyplsOSSInfoForUploadFileResponseBody getBody() {
        return this.body;
    }

}
