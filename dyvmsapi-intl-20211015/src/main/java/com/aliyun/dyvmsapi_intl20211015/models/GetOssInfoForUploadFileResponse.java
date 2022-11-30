// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GetOssInfoForUploadFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssInfoForUploadFileResponseBody body;

    public static GetOssInfoForUploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssInfoForUploadFileResponse self = new GetOssInfoForUploadFileResponse();
        return TeaModel.build(map, self);
    }

    public GetOssInfoForUploadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssInfoForUploadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssInfoForUploadFileResponse setBody(GetOssInfoForUploadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssInfoForUploadFileResponseBody getBody() {
        return this.body;
    }

}
