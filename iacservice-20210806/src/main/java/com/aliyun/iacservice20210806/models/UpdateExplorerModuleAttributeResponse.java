// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateExplorerModuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExplorerModuleAttributeResponseBody body;

    public static UpdateExplorerModuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExplorerModuleAttributeResponse self = new UpdateExplorerModuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExplorerModuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExplorerModuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExplorerModuleAttributeResponse setBody(UpdateExplorerModuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExplorerModuleAttributeResponseBody getBody() {
        return this.body;
    }

}
