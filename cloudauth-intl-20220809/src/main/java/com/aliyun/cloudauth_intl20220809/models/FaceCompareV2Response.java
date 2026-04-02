// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceCompareV2ResponseBody body;

    public static FaceCompareV2Response build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareV2Response self = new FaceCompareV2Response();
        return TeaModel.build(map, self);
    }

    public FaceCompareV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceCompareV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceCompareV2Response setBody(FaceCompareV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceCompareV2ResponseBody getBody() {
        return this.body;
    }

}
