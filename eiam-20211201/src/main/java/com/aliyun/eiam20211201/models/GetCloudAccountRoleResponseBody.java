// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountRoleResponseBody extends TeaModel {
    @NameInMap("CloudAccountRole")
    public GetCloudAccountRoleResponseBodyCloudAccountRole cloudAccountRole;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAccountRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountRoleResponseBody self = new GetCloudAccountRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountRoleResponseBody setCloudAccountRole(GetCloudAccountRoleResponseBodyCloudAccountRole cloudAccountRole) {
        this.cloudAccountRole = cloudAccountRole;
        return this;
    }
    public GetCloudAccountRoleResponseBodyCloudAccountRole getCloudAccountRole() {
        return this.cloudAccountRole;
    }

    public GetCloudAccountRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason extends TeaModel {
        /**
         * <p>错误码</p>
         * 
         * <strong>example:</strong>
         * <p>AuthenticationFail.NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>There is no permission.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason self = new GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult extends TeaModel {
        /**
         * <p>错误原因</p>
         */
        @NameInMap("ErrorReason")
        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason errorReason;

        /**
         * <p>检测时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult self = new GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult setErrorReason(GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResultErrorReason getErrorReason() {
            return this.errorReason;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetCloudAccountRoleResponseBodyCloudAccountRole extends TeaModel {
        /**
         * <p>云账号ID</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>云账号角色外部唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::xxx:role/role-test</p>
         */
        @NameInMap("CloudAccountRoleExternalId")
        public String cloudAccountRoleExternalId;

        /**
         * <p>云账号角色可用性</p>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("CloudAccountRoleHealth")
        public String cloudAccountRoleHealth;

        /**
         * <p>云账号角色验证结果</p>
         */
        @NameInMap("CloudAccountRoleHealthCheckResult")
        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult;

        /**
         * <p>云账号角色ID</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        @NameInMap("CloudAccountRoleId")
        public String cloudAccountRoleId;

        /**
         * <p>云账号名称</p>
         * 
         * <strong>example:</strong>
         * <p>role-test</p>
         */
        @NameInMap("CloudAccountRoleName")
        public String cloudAccountRoleName;

        /**
         * <p>云账号角色用途</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("CloudAccountRoleType")
        public String cloudAccountRoleType;

        /**
         * <p>云账号角色类型</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("CloudAccountRoleUsageType")
        public String cloudAccountRoleUsageType;

        /**
         * <strong>example:</strong>
         * <p>1719320115000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>cloud_account_role_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>云账号角色状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetCloudAccountRoleResponseBodyCloudAccountRole build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountRoleResponseBodyCloudAccountRole self = new GetCloudAccountRoleResponseBodyCloudAccountRole();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
            this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
            return this;
        }
        public String getCloudAccountRoleExternalId() {
            return this.cloudAccountRoleExternalId;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleHealth(String cloudAccountRoleHealth) {
            this.cloudAccountRoleHealth = cloudAccountRoleHealth;
            return this;
        }
        public String getCloudAccountRoleHealth() {
            return this.cloudAccountRoleHealth;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleHealthCheckResult(GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult) {
            this.cloudAccountRoleHealthCheckResult = cloudAccountRoleHealthCheckResult;
            return this;
        }
        public GetCloudAccountRoleResponseBodyCloudAccountRoleCloudAccountRoleHealthCheckResult getCloudAccountRoleHealthCheckResult() {
            return this.cloudAccountRoleHealthCheckResult;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleId(String cloudAccountRoleId) {
            this.cloudAccountRoleId = cloudAccountRoleId;
            return this;
        }
        public String getCloudAccountRoleId() {
            return this.cloudAccountRoleId;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleName(String cloudAccountRoleName) {
            this.cloudAccountRoleName = cloudAccountRoleName;
            return this;
        }
        public String getCloudAccountRoleName() {
            return this.cloudAccountRoleName;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleType(String cloudAccountRoleType) {
            this.cloudAccountRoleType = cloudAccountRoleType;
            return this;
        }
        public String getCloudAccountRoleType() {
            return this.cloudAccountRoleType;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCloudAccountRoleUsageType(String cloudAccountRoleUsageType) {
            this.cloudAccountRoleUsageType = cloudAccountRoleUsageType;
            return this;
        }
        public String getCloudAccountRoleUsageType() {
            return this.cloudAccountRoleUsageType;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCloudAccountRoleResponseBodyCloudAccountRole setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
