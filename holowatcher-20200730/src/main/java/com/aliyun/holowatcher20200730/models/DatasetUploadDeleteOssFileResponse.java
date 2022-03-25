// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadDeleteOssFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DatasetUploadDeleteOssFileResponseBody body;

    public static DatasetUploadDeleteOssFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadDeleteOssFileResponse self = new DatasetUploadDeleteOssFileResponse();
        return TeaModel.build(map, self);
    }

    public DatasetUploadDeleteOssFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DatasetUploadDeleteOssFileResponse setBody(DatasetUploadDeleteOssFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DatasetUploadDeleteOssFileResponseBody getBody() {
        return this.body;
    }

}
