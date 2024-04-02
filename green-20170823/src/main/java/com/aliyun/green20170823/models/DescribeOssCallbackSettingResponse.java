// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssCallbackSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssCallbackSettingResponseBody body;

    public static DescribeOssCallbackSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssCallbackSettingResponse self = new DescribeOssCallbackSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssCallbackSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssCallbackSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssCallbackSettingResponse setBody(DescribeOssCallbackSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssCallbackSettingResponseBody getBody() {
        return this.body;
    }

}
