// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppAdaptorConfigResponseBody body;

    public static GetAppAdaptorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorConfigResponse self = new GetAppAdaptorConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppAdaptorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppAdaptorConfigResponse setBody(GetAppAdaptorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppAdaptorConfigResponseBody getBody() {
        return this.body;
    }

}
