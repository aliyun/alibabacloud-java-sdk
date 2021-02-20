// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class TagAssetsByRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagAssetsByRecordsResponseBody body;

    public static TagAssetsByRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        TagAssetsByRecordsResponse self = new TagAssetsByRecordsResponse();
        return TeaModel.build(map, self);
    }

    public TagAssetsByRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagAssetsByRecordsResponse setBody(TagAssetsByRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public TagAssetsByRecordsResponseBody getBody() {
        return this.body;
    }

}
