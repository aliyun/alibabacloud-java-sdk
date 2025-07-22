// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AllocateCostCenterResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateCostCenterResourceResponseBody body;

    public static AllocateCostCenterResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostCenterResourceResponse self = new AllocateCostCenterResourceResponse();
        return TeaModel.build(map, self);
    }

    public AllocateCostCenterResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateCostCenterResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateCostCenterResourceResponse setBody(AllocateCostCenterResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateCostCenterResourceResponseBody getBody() {
        return this.body;
    }

}
