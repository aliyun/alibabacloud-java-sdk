// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AllocateCostUnitResourceResponse setBody(AllocateCostUnitResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateCostUnitResourceResponseBody getBody() {
        return this.body;
    }

}
