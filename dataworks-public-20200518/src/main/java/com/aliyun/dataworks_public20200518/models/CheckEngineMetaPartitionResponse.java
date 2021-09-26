// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaPartitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckEngineMetaPartitionResponseBody body;

    public static CheckEngineMetaPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaPartitionResponse self = new CheckEngineMetaPartitionResponse();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaPartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckEngineMetaPartitionResponse setBody(CheckEngineMetaPartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckEngineMetaPartitionResponseBody getBody() {
        return this.body;
    }

}
