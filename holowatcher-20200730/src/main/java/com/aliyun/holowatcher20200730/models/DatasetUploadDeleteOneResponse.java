// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadDeleteOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadDeleteOneResponseBody body;

    public static DatasetUploadDeleteOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadDeleteOneResponse self = new DatasetUploadDeleteOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadDeleteOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadDeleteOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetUploadDeleteOneResponse setBody(DatasetUploadDeleteOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadDeleteOneResponseBody getBody() {
        return this.body;
    }

}
