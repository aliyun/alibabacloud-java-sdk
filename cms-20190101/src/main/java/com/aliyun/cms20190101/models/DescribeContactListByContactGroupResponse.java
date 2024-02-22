// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListByContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContactListByContactGroupResponseBody body;

    public static DescribeContactListByContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListByContactGroupResponse self = new DescribeContactListByContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactListByContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactListByContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContactListByContactGroupResponse setBody(DescribeContactListByContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactListByContactGroupResponseBody getBody() {
        return this.body;
    }

}
