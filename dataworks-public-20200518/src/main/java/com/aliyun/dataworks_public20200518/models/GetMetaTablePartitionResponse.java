// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTablePartitionResponseBody body;

    public static GetMetaTablePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionResponse self = new GetMetaTablePartitionResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTablePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTablePartitionResponse setBody(GetMetaTablePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTablePartitionResponseBody getBody() {
        return this.body;
    }

}
