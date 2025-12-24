// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateDownloadUrlForSynchronizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDownloadUrlForSynchronizationJobResponseBody body;

    public static GenerateDownloadUrlForSynchronizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadUrlForSynchronizationJobResponse self = new GenerateDownloadUrlForSynchronizationJobResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDownloadUrlForSynchronizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDownloadUrlForSynchronizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDownloadUrlForSynchronizationJobResponse setBody(GenerateDownloadUrlForSynchronizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDownloadUrlForSynchronizationJobResponseBody getBody() {
        return this.body;
    }

}
