// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetaDataStorageUsagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaDataStorageUsagesResponseBody body;

    public static GetMetaDataStorageUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDataStorageUsagesResponse self = new GetMetaDataStorageUsagesResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDataStorageUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaDataStorageUsagesResponse setBody(GetMetaDataStorageUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaDataStorageUsagesResponseBody getBody() {
        return this.body;
    }

}
