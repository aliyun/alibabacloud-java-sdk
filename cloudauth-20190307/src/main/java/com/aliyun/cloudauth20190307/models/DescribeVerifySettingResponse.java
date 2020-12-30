// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVerifySettingResponseBody body;

    public static DescribeVerifySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySettingResponse self = new DescribeVerifySettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifySettingResponse setBody(DescribeVerifySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifySettingResponseBody getBody() {
        return this.body;
    }

}
