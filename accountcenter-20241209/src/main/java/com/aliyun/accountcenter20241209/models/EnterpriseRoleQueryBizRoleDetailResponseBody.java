// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryBizRoleDetailResponseBody extends TeaModel {
    @NameInMap("BizRoleDetail")
    public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail bizRoleDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseRoleQueryBizRoleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryBizRoleDetailResponseBody self = new EnterpriseRoleQueryBizRoleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryBizRoleDetailResponseBody setBizRoleDetail(EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail bizRoleDetail) {
        this.bizRoleDetail = bizRoleDetail;
        return this;
    }
    public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail getBizRoleDetail() {
        return this.bizRoleDetail;
    }

    public EnterpriseRoleQueryBizRoleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseRoleQueryBizRoleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseRoleQueryBizRoleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRoleQueryBizRoleDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions extends TeaModel {
        @NameInMap("BizPermissionCode")
        public String bizPermissionCode;

        @NameInMap("BizPermissionDesc")
        public String bizPermissionDesc;

        @NameInMap("BizPermissionName")
        public String bizPermissionName;

        public static EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions self = new EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions();
            return TeaModel.build(map, self);
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions setBizPermissionCode(String bizPermissionCode) {
            this.bizPermissionCode = bizPermissionCode;
            return this;
        }
        public String getBizPermissionCode() {
            return this.bizPermissionCode;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions setBizPermissionDesc(String bizPermissionDesc) {
            this.bizPermissionDesc = bizPermissionDesc;
            return this;
        }
        public String getBizPermissionDesc() {
            return this.bizPermissionDesc;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions setBizPermissionName(String bizPermissionName) {
            this.bizPermissionName = bizPermissionName;
            return this;
        }
        public String getBizPermissionName() {
            return this.bizPermissionName;
        }

    }

    public static class EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail extends TeaModel {
        @NameInMap("BizPermissions")
        public java.util.List<EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions> bizPermissions;

        @NameInMap("BizRoleCode")
        public String bizRoleCode;

        @NameInMap("BizRoleDesc")
        public String bizRoleDesc;

        @NameInMap("BizRoleName")
        public String bizRoleName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SrcType")
        public String srcType;

        public static EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail self = new EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail();
            return TeaModel.build(map, self);
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail setBizPermissions(java.util.List<EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions> bizPermissions) {
            this.bizPermissions = bizPermissions;
            return this;
        }
        public java.util.List<EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetailBizPermissions> getBizPermissions() {
            return this.bizPermissions;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail setBizRoleCode(String bizRoleCode) {
            this.bizRoleCode = bizRoleCode;
            return this;
        }
        public String getBizRoleCode() {
            return this.bizRoleCode;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail setBizRoleDesc(String bizRoleDesc) {
            this.bizRoleDesc = bizRoleDesc;
            return this;
        }
        public String getBizRoleDesc() {
            return this.bizRoleDesc;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail setBizRoleName(String bizRoleName) {
            this.bizRoleName = bizRoleName;
            return this;
        }
        public String getBizRoleName() {
            return this.bizRoleName;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public EnterpriseRoleQueryBizRoleDetailResponseBodyBizRoleDetail setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}
