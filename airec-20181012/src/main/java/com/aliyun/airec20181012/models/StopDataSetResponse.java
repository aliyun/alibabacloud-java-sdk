// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class StopDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDataSetResponseBody body;

    public static StopDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataSetResponse self = new StopDataSetResponse();
        return TeaModel.build(map, self);
    }

    public StopDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDataSetResponse setBody(StopDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDataSetResponseBody getBody() {
        return this.body;
    }

}
