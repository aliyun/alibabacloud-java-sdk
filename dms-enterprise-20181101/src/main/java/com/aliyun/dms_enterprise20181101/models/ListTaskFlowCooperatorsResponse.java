// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowCooperatorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskFlowCooperatorsResponseBody body;

    public static ListTaskFlowCooperatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowCooperatorsResponse self = new ListTaskFlowCooperatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowCooperatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowCooperatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowCooperatorsResponse setBody(ListTaskFlowCooperatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowCooperatorsResponseBody getBody() {
        return this.body;
    }

}
