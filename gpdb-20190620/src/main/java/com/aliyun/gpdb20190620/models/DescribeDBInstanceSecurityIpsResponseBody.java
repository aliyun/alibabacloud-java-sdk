// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSecurityIpsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeDBInstanceSecurityIpsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDBInstanceSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSecurityIpsResponseBody self = new DescribeDBInstanceSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSecurityIpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDBInstanceSecurityIpsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeDBInstanceSecurityIpsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDBInstanceSecurityIpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDBInstanceSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSecurityIpsResponseBody setResult(java.util.List<DescribeDBInstanceSecurityIpsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeDBInstanceSecurityIpsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeDBInstanceSecurityIpsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDBInstanceSecurityIpsResponseBodyResult extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static DescribeDBInstanceSecurityIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSecurityIpsResponseBodyResult self = new DescribeDBInstanceSecurityIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSecurityIpsResponseBodyResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBInstanceSecurityIpsResponseBodyResult setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
