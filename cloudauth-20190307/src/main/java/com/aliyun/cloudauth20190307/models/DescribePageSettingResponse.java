// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribePageSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePageSettingResponseBody body;

    public static DescribePageSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePageSettingResponse self = new DescribePageSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribePageSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePageSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePageSettingResponse setBody(DescribePageSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePageSettingResponseBody getBody() {
        return this.body;
    }

}
