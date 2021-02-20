// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class TagAssetsBySearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagAssetsBySearchResponseBody body;

    public static TagAssetsBySearchResponse build(java.util.Map<String, ?> map) throws Exception {
        TagAssetsBySearchResponse self = new TagAssetsBySearchResponse();
        return TeaModel.build(map, self);
    }

    public TagAssetsBySearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagAssetsBySearchResponse setBody(TagAssetsBySearchResponseBody body) {
        this.body = body;
        return this;
    }
    public TagAssetsBySearchResponseBody getBody() {
        return this.body;
    }

}
