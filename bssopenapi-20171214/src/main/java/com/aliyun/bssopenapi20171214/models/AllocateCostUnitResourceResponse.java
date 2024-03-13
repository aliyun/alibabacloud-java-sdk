// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateCostUnitResourceResponseBody body;

    public static AllocateCostUnitResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceResponse self = new AllocateCostUnitResourceResponse();
        return TeaModel.build(map, self);
    }

    public AllocateCostUnitResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateCostUnitResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateCostUnitResourceResponse setBody(AllocateCostUnitResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateCostUnitResourceResponseBody getBody() {
        return this.body;
    }

}
