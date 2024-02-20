// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SenderStatisticsDetailByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SenderStatisticsDetailByParamResponseBody body;

    public static SenderStatisticsDetailByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        SenderStatisticsDetailByParamResponse self = new SenderStatisticsDetailByParamResponse();
        return TeaModel.build(map, self);
    }

    public SenderStatisticsDetailByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SenderStatisticsDetailByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SenderStatisticsDetailByParamResponse setBody(SenderStatisticsDetailByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public SenderStatisticsDetailByParamResponseBody getBody() {
        return this.body;
    }

}
