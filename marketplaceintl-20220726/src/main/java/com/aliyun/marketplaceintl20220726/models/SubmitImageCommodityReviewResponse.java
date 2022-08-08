// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class SubmitImageCommodityReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitImageCommodityReviewResponseBody body;

    public static SubmitImageCommodityReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCommodityReviewResponse self = new SubmitImageCommodityReviewResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageCommodityReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageCommodityReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImageCommodityReviewResponse setBody(SubmitImageCommodityReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageCommodityReviewResponseBody getBody() {
        return this.body;
    }

}
