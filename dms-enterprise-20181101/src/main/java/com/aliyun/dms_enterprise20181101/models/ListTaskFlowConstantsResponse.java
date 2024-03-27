// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowConstantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskFlowConstantsResponseBody body;

    public static ListTaskFlowConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowConstantsResponse self = new ListTaskFlowConstantsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowConstantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowConstantsResponse setBody(ListTaskFlowConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowConstantsResponseBody getBody() {
        return this.body;
    }

}
