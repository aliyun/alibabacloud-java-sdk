// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SyncHDMAliyunResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncHDMAliyunResourceResponseBody body;

    public static SyncHDMAliyunResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncHDMAliyunResourceResponse self = new SyncHDMAliyunResourceResponse();
        return TeaModel.build(map, self);
    }

    public SyncHDMAliyunResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncHDMAliyunResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncHDMAliyunResourceResponse setBody(SyncHDMAliyunResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncHDMAliyunResourceResponseBody getBody() {
        return this.body;
    }

}
