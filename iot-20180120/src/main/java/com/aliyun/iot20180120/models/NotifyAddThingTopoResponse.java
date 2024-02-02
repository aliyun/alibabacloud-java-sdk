// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public NotifyAddThingTopoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NotifyAddThingTopoResponse setBody(NotifyAddThingTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyAddThingTopoResponseBody getBody() {
        return this.body;
    }

}
