// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTopoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetThingTopoResponseBody body;

    public static GetThingTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingTopoResponse self = new GetThingTopoResponse();
        return TeaModel.build(map, self);
    }

    public GetThingTopoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingTopoResponse setBody(GetThingTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingTopoResponseBody getBody() {
        return this.body;
    }

}
