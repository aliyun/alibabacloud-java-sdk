// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadCcRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadCcRouteRulesResponseBody body;

    public static DownloadCcRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadCcRouteRulesResponse self = new DownloadCcRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public DownloadCcRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadCcRouteRulesResponse setBody(DownloadCcRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadCcRouteRulesResponseBody getBody() {
        return this.body;
    }

}
