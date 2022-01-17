// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class UploadCommodityFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadCommodityFileResponseBody body;

    public static UploadCommodityFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCommodityFileResponse self = new UploadCommodityFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadCommodityFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCommodityFileResponse setBody(UploadCommodityFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCommodityFileResponseBody getBody() {
        return this.body;
    }

}
