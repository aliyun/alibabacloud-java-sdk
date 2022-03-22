// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class ForecastRasterQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ForecastRasterQueryResponseBody body;

    public static ForecastRasterQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ForecastRasterQueryResponse self = new ForecastRasterQueryResponse();
        return TeaModel.build(map, self);
    }

    public ForecastRasterQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForecastRasterQueryResponse setBody(ForecastRasterQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ForecastRasterQueryResponseBody getBody() {
        return this.body;
    }

}
