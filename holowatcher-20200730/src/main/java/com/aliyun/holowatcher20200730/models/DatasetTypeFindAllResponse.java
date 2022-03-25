// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetTypeFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetTypeFindAllResponseBody body;

    public static DatasetTypeFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetTypeFindAllResponse self = new DatasetTypeFindAllResponse();
        return TeaModel.build(map, self);
    }

    public DatasetTypeFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetTypeFindAllResponse setBody(DatasetTypeFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetTypeFindAllResponseBody getBody() {
        return this.body;
    }

}
