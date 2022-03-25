// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetFindAllResponseBody body;

    public static DatasetFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetFindAllResponse self = new DatasetFindAllResponse();
        return TeaModel.build(map, self);
    }

    public DatasetFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetFindAllResponse setBody(DatasetFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetFindAllResponseBody getBody() {
        return this.body;
    }

}
