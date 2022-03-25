// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadDeleteOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadDeleteOneResponseBody body;

    public static DatasetUploadDeleteOneResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadDeleteOneResponse self = new DatasetUploadDeleteOneResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadDeleteOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadDeleteOneResponse setBody(DatasetUploadDeleteOneResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadDeleteOneResponseBody getBody() {
        return this.body;
    }

}
