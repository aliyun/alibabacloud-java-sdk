// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHanaBackupSettingResponseBody body;

    public static DescribeHanaBackupSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaBackupSettingResponse self = new DescribeHanaBackupSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaBackupSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaBackupSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaBackupSettingResponse setBody(DescribeHanaBackupSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaBackupSettingResponseBody getBody() {
        return this.body;
    }

}
