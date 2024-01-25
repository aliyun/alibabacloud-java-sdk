// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRetentionSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHanaRetentionSettingResponseBody body;

    public static DescribeHanaRetentionSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaRetentionSettingResponse self = new DescribeHanaRetentionSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaRetentionSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaRetentionSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaRetentionSettingResponse setBody(DescribeHanaRetentionSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaRetentionSettingResponseBody getBody() {
        return this.body;
    }

}
