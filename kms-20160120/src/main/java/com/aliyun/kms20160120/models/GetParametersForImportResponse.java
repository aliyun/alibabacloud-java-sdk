// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetParametersForImportResponseBody body;

    public static GetParametersForImportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportResponse self = new GetParametersForImportResponse();
        return TeaModel.build(map, self);
    }

    public GetParametersForImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParametersForImportResponse setBody(GetParametersForImportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParametersForImportResponseBody getBody() {
        return this.body;
    }

}
