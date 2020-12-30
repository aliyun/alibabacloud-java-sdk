// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListVswitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVswitchResponseBody body;

    public static ListVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVswitchResponse self = new ListVswitchResponse();
        return TeaModel.build(map, self);
    }

    public ListVswitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVswitchResponse setBody(ListVswitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVswitchResponseBody getBody() {
        return this.body;
    }

}
