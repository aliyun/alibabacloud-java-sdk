// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAccountRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAccountRoleResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAccountRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRoleResponseBody self = new DescribeAccountRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAccountRoleResponseBody setData(DescribeAccountRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAccountRoleResponseBodyData getData() {
        return this.data;
    }

    public DescribeAccountRoleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAccountRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAccountRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAccountRoleResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedBaaS")
        public Boolean authorizedBaaS;

        @NameInMap("RoleType")
        public String roleType;

        public static DescribeAccountRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountRoleResponseBodyData self = new DescribeAccountRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountRoleResponseBodyData setAuthorizedBaaS(Boolean authorizedBaaS) {
            this.authorizedBaaS = authorizedBaaS;
            return this;
        }
        public Boolean getAuthorizedBaaS() {
            return this.authorizedBaaS;
        }

        public DescribeAccountRoleResponseBodyData setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
