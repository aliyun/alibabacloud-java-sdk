// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckDataSourceConnectivityOnResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDataSourceConnectivityOnResourceGroupResponseBody body;

    public static CheckDataSourceConnectivityOnResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceConnectivityOnResourceGroupResponse self = new CheckDataSourceConnectivityOnResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceConnectivityOnResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataSourceConnectivityOnResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataSourceConnectivityOnResourceGroupResponse setBody(CheckDataSourceConnectivityOnResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataSourceConnectivityOnResourceGroupResponseBody getBody() {
        return this.body;
    }

}
