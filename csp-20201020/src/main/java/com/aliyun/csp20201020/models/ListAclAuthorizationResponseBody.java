// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListAclAuthorizationResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAclAuthorizationResponseBodyData> data;

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

    public static ListAclAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclAuthorizationResponseBody self = new ListAclAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclAuthorizationResponseBody setData(java.util.List<ListAclAuthorizationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAclAuthorizationResponseBodyData> getData() {
        return this.data;
    }

    public ListAclAuthorizationResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public ListAclAuthorizationResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListAclAuthorizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAclAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAclAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAclAuthorizationResponseBodyData extends TeaModel {
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

        public static ListAclAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAclAuthorizationResponseBodyData self = new ListAclAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAclAuthorizationResponseBodyData setAclOperationList(java.util.List<String> aclOperationList) {
            this.aclOperationList = aclOperationList;
            return this;
        }
        public java.util.List<String> getAclOperationList() {
            return this.aclOperationList;
        }

        public ListAclAuthorizationResponseBodyData setPatternType(String patternType) {
            this.patternType = patternType;
            return this;
        }
        public String getPatternType() {
            return this.patternType;
        }

        public ListAclAuthorizationResponseBodyData setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

        public ListAclAuthorizationResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListAclAuthorizationResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
