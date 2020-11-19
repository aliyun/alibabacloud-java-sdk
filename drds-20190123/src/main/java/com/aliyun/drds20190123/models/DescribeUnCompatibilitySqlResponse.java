// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeUnCompatibilitySqlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorSqls")
    @Validation(required = true)
    public java.util.List<String> errorSqls;

    public static DescribeUnCompatibilitySqlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnCompatibilitySqlResponse self = new DescribeUnCompatibilitySqlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnCompatibilitySqlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUnCompatibilitySqlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUnCompatibilitySqlResponse setErrorSqls(java.util.List<String> errorSqls) {
        this.errorSqls = errorSqls;
        return this;
    }
    public java.util.List<String> getErrorSqls() {
        return this.errorSqls;
    }

}
