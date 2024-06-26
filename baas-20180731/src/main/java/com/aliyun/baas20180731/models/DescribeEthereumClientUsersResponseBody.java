// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumClientUsersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeEthereumClientUsersResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumClientUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumClientUsersResponseBody self = new DescribeEthereumClientUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumClientUsersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumClientUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumClientUsersResponseBody setResult(java.util.List<DescribeEthereumClientUsersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeEthereumClientUsersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeEthereumClientUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumClientUsersResponseBodyResult extends TeaModel {
        @NameInMap("Username")
        public String username;

        public static DescribeEthereumClientUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumClientUsersResponseBodyResult self = new DescribeEthereumClientUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumClientUsersResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
