// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveCdnDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveCdnDomainConfigResponseBody body;

    public static SaveCdnDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCdnDomainConfigResponse self = new SaveCdnDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveCdnDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCdnDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveCdnDomainConfigResponse setBody(SaveCdnDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCdnDomainConfigResponseBody getBody() {
        return this.body;
    }

}
