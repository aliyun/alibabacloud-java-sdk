// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountRolesResponseBody extends TeaModel {
    @NameInMap("CloudAccountRoles")
    public java.util.List<ListCloudAccountRolesResponseBodyCloudAccountRoles> cloudAccountRoles;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCloudAccountRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountRolesResponseBody self = new ListCloudAccountRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountRolesResponseBody setCloudAccountRoles(java.util.List<ListCloudAccountRolesResponseBodyCloudAccountRoles> cloudAccountRoles) {
        this.cloudAccountRoles = cloudAccountRoles;
        return this;
    }
    public java.util.List<ListCloudAccountRolesResponseBodyCloudAccountRoles> getCloudAccountRoles() {
        return this.cloudAccountRoles;
    }

    public ListCloudAccountRolesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountRolesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCloudAccountRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAccountRolesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AuthenticationFail.NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>There is no permission.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason self = new ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult extends TeaModel {
        @NameInMap("ErrorReason")
        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason errorReason;

        /**
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult self = new ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult setErrorReason(ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResultErrorReason getErrorReason() {
            return this.errorReason;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class ListCloudAccountRolesResponseBodyCloudAccountRoles extends TeaModel {
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

        @NameInMap("CloudAccountRoleHealthCheckResult")
        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult;

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
         * <p>云账号角色类别</p>
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
         * <p>云账号描述</p>
         * 
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
         * <p>1719320117000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListCloudAccountRolesResponseBodyCloudAccountRoles build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountRolesResponseBodyCloudAccountRoles self = new ListCloudAccountRolesResponseBodyCloudAccountRoles();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
            this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
            return this;
        }
        public String getCloudAccountRoleExternalId() {
            return this.cloudAccountRoleExternalId;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleHealth(String cloudAccountRoleHealth) {
            this.cloudAccountRoleHealth = cloudAccountRoleHealth;
            return this;
        }
        public String getCloudAccountRoleHealth() {
            return this.cloudAccountRoleHealth;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleHealthCheckResult(ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult) {
            this.cloudAccountRoleHealthCheckResult = cloudAccountRoleHealthCheckResult;
            return this;
        }
        public ListCloudAccountRolesResponseBodyCloudAccountRolesCloudAccountRoleHealthCheckResult getCloudAccountRoleHealthCheckResult() {
            return this.cloudAccountRoleHealthCheckResult;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleId(String cloudAccountRoleId) {
            this.cloudAccountRoleId = cloudAccountRoleId;
            return this;
        }
        public String getCloudAccountRoleId() {
            return this.cloudAccountRoleId;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleName(String cloudAccountRoleName) {
            this.cloudAccountRoleName = cloudAccountRoleName;
            return this;
        }
        public String getCloudAccountRoleName() {
            return this.cloudAccountRoleName;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleType(String cloudAccountRoleType) {
            this.cloudAccountRoleType = cloudAccountRoleType;
            return this;
        }
        public String getCloudAccountRoleType() {
            return this.cloudAccountRoleType;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCloudAccountRoleUsageType(String cloudAccountRoleUsageType) {
            this.cloudAccountRoleUsageType = cloudAccountRoleUsageType;
            return this;
        }
        public String getCloudAccountRoleUsageType() {
            return this.cloudAccountRoleUsageType;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloudAccountRolesResponseBodyCloudAccountRoles setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
