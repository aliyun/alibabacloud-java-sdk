// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudAssistantSettingsResponseBody body;

    public static DescribeCloudAssistantSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantSettingsResponse self = new DescribeCloudAssistantSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudAssistantSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudAssistantSettingsResponse setBody(DescribeCloudAssistantSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBody getBody() {
        return this.body;
    }

}
