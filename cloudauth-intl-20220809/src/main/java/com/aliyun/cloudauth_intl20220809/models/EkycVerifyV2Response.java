// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EkycVerifyV2ResponseBody body;

    public static EkycVerifyV2Response build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyV2Response self = new EkycVerifyV2Response();
        return TeaModel.build(map, self);
    }

    public EkycVerifyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EkycVerifyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EkycVerifyV2Response setBody(EkycVerifyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public EkycVerifyV2ResponseBody getBody() {
        return this.body;
    }

}
