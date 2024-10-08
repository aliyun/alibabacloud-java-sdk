// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteVanityNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteVanityNSResponseBody body;

    public static UpdateSiteVanityNSResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteVanityNSResponse self = new UpdateSiteVanityNSResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteVanityNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteVanityNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteVanityNSResponse setBody(UpdateSiteVanityNSResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteVanityNSResponseBody getBody() {
        return this.body;
    }

}
