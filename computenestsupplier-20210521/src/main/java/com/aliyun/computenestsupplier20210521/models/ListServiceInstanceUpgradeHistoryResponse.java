// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceUpgradeHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceInstanceUpgradeHistoryResponseBody body;

    public static ListServiceInstanceUpgradeHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceUpgradeHistoryResponse self = new ListServiceInstanceUpgradeHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceUpgradeHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceUpgradeHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceUpgradeHistoryResponse setBody(ListServiceInstanceUpgradeHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceUpgradeHistoryResponseBody getBody() {
        return this.body;
    }

}
