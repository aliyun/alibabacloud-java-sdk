// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BatchDeleteWebHostingFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteWebHostingFilesResponseBody body;

    public static BatchDeleteWebHostingFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteWebHostingFilesResponse self = new BatchDeleteWebHostingFilesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteWebHostingFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteWebHostingFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteWebHostingFilesResponse setBody(BatchDeleteWebHostingFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteWebHostingFilesResponseBody getBody() {
        return this.body;
    }

}
