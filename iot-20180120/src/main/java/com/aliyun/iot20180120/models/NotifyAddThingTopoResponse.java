// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyAddThingTopoResponseBody body;

    public static NotifyAddThingTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoResponse self = new NotifyAddThingTopoResponse();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyAddThingTopoResponse setBody(NotifyAddThingTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyAddThingTopoResponseBody getBody() {
        return this.body;
    }

}
