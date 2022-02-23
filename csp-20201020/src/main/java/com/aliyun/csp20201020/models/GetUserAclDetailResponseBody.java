// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class GetUserAclDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetUserAclDetailResponseBodyData data;

    @NameInMap("ErrCode")
    public Integer errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserAclDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAclDetailResponseBody self = new GetUserAclDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAclDetailResponseBody setData(GetUserAclDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserAclDetailResponseBodyData getData() {
        return this.data;
    }

    public GetUserAclDetailResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public GetUserAclDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetUserAclDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserAclDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAclDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserAclDetailResponseBodyData extends TeaModel {
        @NameInMap("AclOperationList")
        public java.util.List<String> aclOperationList;

        @NameInMap("PatternType")
        public String patternType;

        @NameInMap("PermissionType")
        public String permissionType;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetUserAclDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserAclDetailResponseBodyData self = new GetUserAclDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserAclDetailResponseBodyData setAclOperationList(java.util.List<String> aclOperationList) {
            this.aclOperationList = aclOperationList;
            return this;
        }
        public java.util.List<String> getAclOperationList() {
            return this.aclOperationList;
        }

        public GetUserAclDetailResponseBodyData setPatternType(String patternType) {
            this.patternType = patternType;
            return this;
        }
        public String getPatternType() {
            return this.patternType;
        }

        public GetUserAclDetailResponseBodyData setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

        public GetUserAclDetailResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetUserAclDetailResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
