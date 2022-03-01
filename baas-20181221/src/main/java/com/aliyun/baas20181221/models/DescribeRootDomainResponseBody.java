// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeRootDomainResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRootDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRootDomainResponseBody self = new DescribeRootDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRootDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeRootDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRootDomainResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeRootDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
