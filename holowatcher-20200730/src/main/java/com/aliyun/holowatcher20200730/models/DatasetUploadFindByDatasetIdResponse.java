// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByDatasetIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadFindByDatasetIdResponseBody body;

    public static DatasetUploadFindByDatasetIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByDatasetIdResponse self = new DatasetUploadFindByDatasetIdResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByDatasetIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadFindByDatasetIdResponse setBody(DatasetUploadFindByDatasetIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadFindByDatasetIdResponseBody getBody() {
        return this.body;
    }

}
