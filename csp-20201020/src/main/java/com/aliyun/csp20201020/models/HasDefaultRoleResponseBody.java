// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class HasDefaultRoleResponseBody extends TeaModel {
    @NameInMap("Data")
    public HasDefaultRoleResponseBodyData data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static HasDefaultRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HasDefaultRoleResponseBody self = new HasDefaultRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public HasDefaultRoleResponseBody setData(HasDefaultRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HasDefaultRoleResponseBodyData getData() {
        return this.data;
    }

    public HasDefaultRoleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public HasDefaultRoleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public HasDefaultRoleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HasDefaultRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HasDefaultRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class HasDefaultRoleResponseBodyData extends TeaModel {
        @NameInMap("HasAuth")
        public Boolean hasAuth;

        @NameInMap("RoleAuthUrl")
        public String roleAuthUrl;

        public static HasDefaultRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HasDefaultRoleResponseBodyData self = new HasDefaultRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HasDefaultRoleResponseBodyData setHasAuth(Boolean hasAuth) {
            this.hasAuth = hasAuth;
            return this;
        }
        public Boolean getHasAuth() {
            return this.hasAuth;
        }

        public HasDefaultRoleResponseBodyData setRoleAuthUrl(String roleAuthUrl) {
            this.roleAuthUrl = roleAuthUrl;
            return this;
        }
        public String getRoleAuthUrl() {
            return this.roleAuthUrl;
        }

    }

}
