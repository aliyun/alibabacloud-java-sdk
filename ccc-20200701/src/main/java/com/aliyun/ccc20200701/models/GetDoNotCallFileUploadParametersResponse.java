// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDoNotCallFileUploadParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoNotCallFileUploadParametersResponseBody body;

    public static GetDoNotCallFileUploadParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoNotCallFileUploadParametersResponse self = new GetDoNotCallFileUploadParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetDoNotCallFileUploadParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoNotCallFileUploadParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoNotCallFileUploadParametersResponse setBody(GetDoNotCallFileUploadParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoNotCallFileUploadParametersResponseBody getBody() {
        return this.body;
    }

}
