// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListShopGroupResponseBody body;

    public static ListShopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShopGroupResponse self = new ListShopGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListShopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShopGroupResponse setBody(ListShopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShopGroupResponseBody getBody() {
        return this.body;
    }

}
