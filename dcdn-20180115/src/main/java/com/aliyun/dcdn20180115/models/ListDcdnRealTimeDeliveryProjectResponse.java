// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnRealTimeDeliveryProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDcdnRealTimeDeliveryProjectResponseBody body;

    public static ListDcdnRealTimeDeliveryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnRealTimeDeliveryProjectResponse self = new ListDcdnRealTimeDeliveryProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListDcdnRealTimeDeliveryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDcdnRealTimeDeliveryProjectResponse setBody(ListDcdnRealTimeDeliveryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDcdnRealTimeDeliveryProjectResponseBody getBody() {
        return this.body;
    }

}
