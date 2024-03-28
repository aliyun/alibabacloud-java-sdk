// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainCorsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveWebHostingCustomDomainCorsConfigResponseBody body;

    public static SaveWebHostingCustomDomainCorsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWebHostingCustomDomainCorsConfigResponse self = new SaveWebHostingCustomDomainCorsConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveWebHostingCustomDomainCorsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWebHostingCustomDomainCorsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWebHostingCustomDomainCorsConfigResponse setBody(SaveWebHostingCustomDomainCorsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWebHostingCustomDomainCorsConfigResponseBody getBody() {
        return this.body;
    }

}
