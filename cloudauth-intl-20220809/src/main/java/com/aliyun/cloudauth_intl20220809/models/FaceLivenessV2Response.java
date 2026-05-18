// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceLivenessV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceLivenessV2ResponseBody body;

    public static FaceLivenessV2Response build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessV2Response self = new FaceLivenessV2Response();
        return TeaModel.build(map, self);
    }

    public FaceLivenessV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceLivenessV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceLivenessV2Response setBody(FaceLivenessV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceLivenessV2ResponseBody getBody() {
        return this.body;
    }

}
