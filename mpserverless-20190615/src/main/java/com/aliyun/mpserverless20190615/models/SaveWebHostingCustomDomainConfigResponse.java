// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public SaveWebHostingCustomDomainConfigResponse setBody(SaveWebHostingCustomDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWebHostingCustomDomainConfigResponseBody getBody() {
        return this.body;
    }

}
