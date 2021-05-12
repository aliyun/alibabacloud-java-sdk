// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GenerateVendorConfigTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateVendorConfigTemplateResponseBody body;

    public static GenerateVendorConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVendorConfigTemplateResponse self = new GenerateVendorConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVendorConfigTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateVendorConfigTemplateResponse setBody(GenerateVendorConfigTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVendorConfigTemplateResponseBody getBody() {
        return this.body;
    }

}
