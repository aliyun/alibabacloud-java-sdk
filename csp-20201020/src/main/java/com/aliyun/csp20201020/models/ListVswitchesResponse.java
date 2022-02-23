// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListVswitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVswitchesResponseBody body;

    public static ListVswitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVswitchesResponse self = new ListVswitchesResponse();
        return TeaModel.build(map, self);
    }

    public ListVswitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVswitchesResponse setBody(ListVswitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVswitchesResponseBody getBody() {
        return this.body;
    }

}
