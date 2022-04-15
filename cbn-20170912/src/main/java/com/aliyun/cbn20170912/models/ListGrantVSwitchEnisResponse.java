// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGrantVSwitchEnisResponseBody body;

    public static ListGrantVSwitchEnisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchEnisResponse self = new ListGrantVSwitchEnisResponse();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchEnisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrantVSwitchEnisResponse setBody(ListGrantVSwitchEnisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGrantVSwitchEnisResponseBody getBody() {
        return this.body;
    }

}
