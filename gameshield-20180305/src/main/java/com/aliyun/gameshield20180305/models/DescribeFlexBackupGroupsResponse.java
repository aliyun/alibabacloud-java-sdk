// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexBackupGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlexBackupGroupsResponseBody body;

    public static DescribeFlexBackupGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexBackupGroupsResponse self = new DescribeFlexBackupGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlexBackupGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlexBackupGroupsResponse setBody(DescribeFlexBackupGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlexBackupGroupsResponseBody getBody() {
        return this.body;
    }

}
