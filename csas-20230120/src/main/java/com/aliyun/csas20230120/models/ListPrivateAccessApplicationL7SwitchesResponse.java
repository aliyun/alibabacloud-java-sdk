// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationL7SwitchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivateAccessApplicationL7SwitchesResponseBody body;

    public static ListPrivateAccessApplicationL7SwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationL7SwitchesResponse self = new ListPrivateAccessApplicationL7SwitchesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationL7SwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateAccessApplicationL7SwitchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateAccessApplicationL7SwitchesResponse setBody(ListPrivateAccessApplicationL7SwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateAccessApplicationL7SwitchesResponseBody getBody() {
        return this.body;
    }

}
