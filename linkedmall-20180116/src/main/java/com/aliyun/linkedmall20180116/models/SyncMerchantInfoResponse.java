// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SyncMerchantInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncMerchantInfoResponseBody body;

    public static SyncMerchantInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMerchantInfoResponse self = new SyncMerchantInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncMerchantInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMerchantInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMerchantInfoResponse setBody(SyncMerchantInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMerchantInfoResponseBody getBody() {
        return this.body;
    }

}
