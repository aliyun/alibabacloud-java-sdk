// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebHostingConfigResponseBody body;

    public static GetWebHostingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingConfigResponse self = new GetWebHostingConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingConfigResponse setBody(GetWebHostingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingConfigResponseBody getBody() {
        return this.body;
    }

}
