// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateDatasetItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasetItemResponseBody body;

    public static CreateDatasetItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetItemResponse self = new CreateDatasetItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasetItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasetItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasetItemResponse setBody(CreateDatasetItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasetItemResponseBody getBody() {
        return this.body;
    }

}
