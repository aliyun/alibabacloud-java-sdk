// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateExplorerTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExplorerTaskAttributeResponseBody body;

    public static UpdateExplorerTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExplorerTaskAttributeResponse self = new UpdateExplorerTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExplorerTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExplorerTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExplorerTaskAttributeResponse setBody(UpdateExplorerTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExplorerTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
