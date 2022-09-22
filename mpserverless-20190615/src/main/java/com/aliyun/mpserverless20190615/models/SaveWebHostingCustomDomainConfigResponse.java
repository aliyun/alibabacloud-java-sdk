// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveWebHostingCustomDomainConfigResponseBody body;

    public static SaveWebHostingCustomDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWebHostingCustomDomainConfigResponse self = new SaveWebHostingCustomDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveWebHostingCustomDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWebHostingCustomDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWebHostingCustomDomainConfigResponse setBody(SaveWebHostingCustomDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWebHostingCustomDomainConfigResponseBody getBody() {
        return this.body;
    }

}
