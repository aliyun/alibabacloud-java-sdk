// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaTableChangeLogResponseBody body;

    public static GetMetaTableChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogResponse self = new GetMetaTableChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableChangeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableChangeLogResponse setBody(GetMetaTableChangeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableChangeLogResponseBody getBody() {
        return this.body;
    }

}
