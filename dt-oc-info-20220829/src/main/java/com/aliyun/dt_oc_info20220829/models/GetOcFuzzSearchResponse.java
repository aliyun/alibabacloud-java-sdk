// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcFuzzSearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcFuzzSearchResponseBody body;

    public static GetOcFuzzSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcFuzzSearchResponse self = new GetOcFuzzSearchResponse();
        return TeaModel.build(map, self);
    }

    public GetOcFuzzSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcFuzzSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcFuzzSearchResponse setBody(GetOcFuzzSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcFuzzSearchResponseBody getBody() {
        return this.body;
    }

}
