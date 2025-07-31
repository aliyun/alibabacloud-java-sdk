// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataQualityScanResponseBody body;

    public static DeleteDataQualityScanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityScanResponse self = new DeleteDataQualityScanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataQualityScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataQualityScanResponse setBody(DeleteDataQualityScanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataQualityScanResponseBody getBody() {
        return this.body;
    }

}
