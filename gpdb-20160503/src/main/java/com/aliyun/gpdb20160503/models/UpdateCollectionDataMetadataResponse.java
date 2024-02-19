// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateCollectionDataMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCollectionDataMetadataResponseBody body;

    public static UpdateCollectionDataMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectionDataMetadataResponse self = new UpdateCollectionDataMetadataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCollectionDataMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCollectionDataMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCollectionDataMetadataResponse setBody(UpdateCollectionDataMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCollectionDataMetadataResponseBody getBody() {
        return this.body;
    }

}
