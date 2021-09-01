// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventDatasResponseBody body;

    public static GetEventDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventDatasResponse self = new GetEventDatasResponse();
        return TeaModel.build(map, self);
    }

    public GetEventDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventDatasResponse setBody(GetEventDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventDatasResponseBody getBody() {
        return this.body;
    }

}
