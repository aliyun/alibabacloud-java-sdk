// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeRoleResponseBody extends TeaModel {
    @NameInMap("Exist")
    public Boolean exist;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleResponseBody self = new DescribeRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoleResponseBody setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public DescribeRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
