// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchesToCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGrantVSwitchesToCenResponseBody body;

    public static ListGrantVSwitchesToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchesToCenResponse self = new ListGrantVSwitchesToCenResponse();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchesToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrantVSwitchesToCenResponse setBody(ListGrantVSwitchesToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGrantVSwitchesToCenResponseBody getBody() {
        return this.body;
    }

}
