// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementCheckSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssIncrementCheckSettingResponseBody body;

    public static DescribeOssIncrementCheckSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementCheckSettingResponse self = new DescribeOssIncrementCheckSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementCheckSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssIncrementCheckSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssIncrementCheckSettingResponse setBody(DescribeOssIncrementCheckSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBody getBody() {
        return this.body;
    }

}
