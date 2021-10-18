// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class StationDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StationDayResponseBody body;

    public static StationDayResponse build(java.util.Map<String, ?> map) throws Exception {
        StationDayResponse self = new StationDayResponse();
        return TeaModel.build(map, self);
    }

    public StationDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StationDayResponse setBody(StationDayResponseBody body) {
        this.body = body;
        return this;
    }
    public StationDayResponseBody getBody() {
        return this.body;
    }

}
