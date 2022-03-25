// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByProjectIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadFindByProjectIdResponseBody body;

    public static DatasetUploadFindByProjectIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByProjectIdResponse self = new DatasetUploadFindByProjectIdResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByProjectIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadFindByProjectIdResponse setBody(DatasetUploadFindByProjectIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadFindByProjectIdResponseBody getBody() {
        return this.body;
    }

}
