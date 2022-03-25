// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByProjectIdAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadFindByProjectIdAppResponseBody body;

    public static DatasetUploadFindByProjectIdAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByProjectIdAppResponse self = new DatasetUploadFindByProjectIdAppResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByProjectIdAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadFindByProjectIdAppResponse setBody(DatasetUploadFindByProjectIdAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadFindByProjectIdAppResponseBody getBody() {
        return this.body;
    }

}
