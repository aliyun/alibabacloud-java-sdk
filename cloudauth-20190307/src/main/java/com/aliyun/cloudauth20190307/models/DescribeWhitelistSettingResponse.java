// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhitelistSettingResponseBody body;

    public static DescribeWhitelistSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistSettingResponse self = new DescribeWhitelistSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhitelistSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhitelistSettingResponse setBody(DescribeWhitelistSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhitelistSettingResponseBody getBody() {
        return this.body;
    }

}
