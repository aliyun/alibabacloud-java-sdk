// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SingleSendMailV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SingleSendMailV2ResponseBody body;

    public static SingleSendMailV2Response build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailV2Response self = new SingleSendMailV2Response();
        return TeaModel.build(map, self);
    }

    public SingleSendMailV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleSendMailV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleSendMailV2Response setBody(SingleSendMailV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleSendMailV2ResponseBody getBody() {
        return this.body;
    }

}
