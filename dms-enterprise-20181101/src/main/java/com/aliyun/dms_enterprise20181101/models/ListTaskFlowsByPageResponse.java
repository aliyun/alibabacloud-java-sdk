// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskFlowsByPageResponseBody body;

    public static ListTaskFlowsByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowsByPageResponse self = new ListTaskFlowsByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowsByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowsByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowsByPageResponse setBody(ListTaskFlowsByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowsByPageResponseBody getBody() {
        return this.body;
    }

}
