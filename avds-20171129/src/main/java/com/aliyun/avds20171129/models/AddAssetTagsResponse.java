// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddAssetTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAssetTagsResponseBody body;

    public static AddAssetTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAssetTagsResponse self = new AddAssetTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddAssetTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAssetTagsResponse setBody(AddAssetTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAssetTagsResponseBody getBody() {
        return this.body;
    }

}
