// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class StartOnlineWorkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartOnlineWorkResponseBody body;

    public static StartOnlineWorkResponse build(java.util.Map<String, ?> map) throws Exception {
        StartOnlineWorkResponse self = new StartOnlineWorkResponse();
        return TeaModel.build(map, self);
    }

    public StartOnlineWorkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartOnlineWorkResponse setBody(StartOnlineWorkResponseBody body) {
        this.body = body;
        return this;
    }
    public StartOnlineWorkResponseBody getBody() {
        return this.body;
    }

}
