// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDatasetItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetItemResponseBody body;

    public static DeleteDatasetItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetItemResponse self = new DeleteDatasetItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetItemResponse setBody(DeleteDatasetItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetItemResponseBody getBody() {
        return this.body;
    }

}
