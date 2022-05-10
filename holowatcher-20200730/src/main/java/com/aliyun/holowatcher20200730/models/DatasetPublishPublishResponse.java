// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetPublishPublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetPublishPublishResponseBody body;

    public static DatasetPublishPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetPublishPublishResponse self = new DatasetPublishPublishResponse();
        return TeaModel.build(map, self);
    }

    public DatasetPublishPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetPublishPublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DatasetPublishPublishResponse setBody(DatasetPublishPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetPublishPublishResponseBody getBody() {
        return this.body;
    }

}
