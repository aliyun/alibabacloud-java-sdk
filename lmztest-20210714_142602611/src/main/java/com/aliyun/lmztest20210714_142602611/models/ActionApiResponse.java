// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class ActionApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActionApiResponseBody body;

    public static ActionApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ActionApiResponse self = new ActionApiResponse();
        return TeaModel.build(map, self);
    }

    public ActionApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActionApiResponse setBody(ActionApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ActionApiResponseBody getBody() {
        return this.body;
    }

}
