// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUpgradeClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUpgradeClientsResponseBody body;

    public static ListUpgradeClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeClientsResponse self = new ListUpgradeClientsResponse();
        return TeaModel.build(map, self);
    }

    public ListUpgradeClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpgradeClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUpgradeClientsResponse setBody(ListUpgradeClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpgradeClientsResponseBody getBody() {
        return this.body;
    }

}
