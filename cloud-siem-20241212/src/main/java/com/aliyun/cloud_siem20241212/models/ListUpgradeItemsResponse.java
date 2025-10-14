// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListUpgradeItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUpgradeItemsResponseBody body;

    public static ListUpgradeItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeItemsResponse self = new ListUpgradeItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListUpgradeItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpgradeItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUpgradeItemsResponse setBody(ListUpgradeItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpgradeItemsResponseBody getBody() {
        return this.body;
    }

}
