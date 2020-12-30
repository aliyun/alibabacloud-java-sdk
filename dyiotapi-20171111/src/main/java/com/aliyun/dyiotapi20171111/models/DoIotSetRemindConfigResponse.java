// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotSetRemindConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoIotSetRemindConfigResponseBody body;

    public static DoIotSetRemindConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DoIotSetRemindConfigResponse self = new DoIotSetRemindConfigResponse();
        return TeaModel.build(map, self);
    }

    public DoIotSetRemindConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoIotSetRemindConfigResponse setBody(DoIotSetRemindConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DoIotSetRemindConfigResponseBody getBody() {
        return this.body;
    }

}
