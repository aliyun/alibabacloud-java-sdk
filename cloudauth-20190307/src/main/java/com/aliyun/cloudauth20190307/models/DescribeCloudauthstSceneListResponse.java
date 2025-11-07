// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCloudauthstSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudauthstSceneListResponseBody body;

    public static DescribeCloudauthstSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudauthstSceneListResponse self = new DescribeCloudauthstSceneListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudauthstSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudauthstSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudauthstSceneListResponse setBody(DescribeCloudauthstSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudauthstSceneListResponseBody getBody() {
        return this.body;
    }

}
