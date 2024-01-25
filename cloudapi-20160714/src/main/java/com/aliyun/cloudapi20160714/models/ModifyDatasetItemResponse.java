// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyDatasetItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDatasetItemResponseBody body;

    public static ModifyDatasetItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatasetItemResponse self = new ModifyDatasetItemResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatasetItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatasetItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDatasetItemResponse setBody(ModifyDatasetItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatasetItemResponseBody getBody() {
        return this.body;
    }

}
