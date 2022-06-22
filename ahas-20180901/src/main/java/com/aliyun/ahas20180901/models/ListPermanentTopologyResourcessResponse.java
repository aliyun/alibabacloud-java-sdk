// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPermanentTopologyResourcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPermanentTopologyResourcessResponseBody body;

    public static ListPermanentTopologyResourcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermanentTopologyResourcessResponse self = new ListPermanentTopologyResourcessResponse();
        return TeaModel.build(map, self);
    }

    public ListPermanentTopologyResourcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermanentTopologyResourcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermanentTopologyResourcessResponse setBody(ListPermanentTopologyResourcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermanentTopologyResourcessResponseBody getBody() {
        return this.body;
    }

}
