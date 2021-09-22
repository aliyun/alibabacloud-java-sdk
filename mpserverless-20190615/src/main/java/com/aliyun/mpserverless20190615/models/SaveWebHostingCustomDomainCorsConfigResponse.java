// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainCorsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveWebHostingCustomDomainCorsConfigResponse setBody(SaveWebHostingCustomDomainCorsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWebHostingCustomDomainCorsConfigResponseBody getBody() {
        return this.body;
    }

}
