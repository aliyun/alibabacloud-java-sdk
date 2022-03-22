// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class GridWeatherQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GridWeatherQueryResponseBody body;

    public static GridWeatherQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GridWeatherQueryResponse self = new GridWeatherQueryResponse();
        return TeaModel.build(map, self);
    }

    public GridWeatherQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GridWeatherQueryResponse setBody(GridWeatherQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GridWeatherQueryResponseBody getBody() {
        return this.body;
    }

}
