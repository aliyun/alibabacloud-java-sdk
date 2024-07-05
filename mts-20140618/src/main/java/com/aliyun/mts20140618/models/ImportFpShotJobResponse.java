// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImportFpShotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportFpShotJobResponseBody body;

    public static ImportFpShotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportFpShotJobResponse self = new ImportFpShotJobResponse();
        return TeaModel.build(map, self);
    }

    public ImportFpShotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportFpShotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportFpShotJobResponse setBody(ImportFpShotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportFpShotJobResponseBody getBody() {
        return this.body;
    }

}
