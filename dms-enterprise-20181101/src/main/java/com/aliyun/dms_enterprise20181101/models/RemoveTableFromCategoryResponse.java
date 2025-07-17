// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RemoveTableFromCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTableFromCategoryResponseBody body;

    public static RemoveTableFromCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTableFromCategoryResponse self = new RemoveTableFromCategoryResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTableFromCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTableFromCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTableFromCategoryResponse setBody(RemoveTableFromCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTableFromCategoryResponseBody getBody() {
        return this.body;
    }

}
