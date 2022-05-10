// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadCreateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadCreateOneResponseBody body;

    public static DatasetUploadCreateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadCreateOneResponse self = new DatasetUploadCreateOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadCreateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadCreateOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetUploadCreateOneResponse setBody(DatasetUploadCreateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadCreateOneResponseBody getBody() {
        return this.body;
    }

}
