// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentThemeUploadSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataAgentThemeUploadSignatureResponseBody body;

    public static GetDataAgentThemeUploadSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentThemeUploadSignatureResponse self = new GetDataAgentThemeUploadSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAgentThemeUploadSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAgentThemeUploadSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataAgentThemeUploadSignatureResponse setBody(GetDataAgentThemeUploadSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAgentThemeUploadSignatureResponseBody getBody() {
        return this.body;
    }

}
