// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyResourcePermissionRequest extends TeaModel {
    /**
     * <p>The permission application request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyCommand")
    public ApplyResourcePermissionRequestApplyCommand applyCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ApplyResourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourcePermissionRequest self = new ApplyResourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ApplyResourcePermissionRequest setApplyCommand(ApplyResourcePermissionRequestApplyCommand applyCommand) {
        this.applyCommand = applyCommand;
        return this;
    }
    public ApplyResourcePermissionRequestApplyCommand getApplyCommand() {
        return this.applyCommand;
    }

    public ApplyResourcePermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ApplyResourcePermissionRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ApplyResourcePermissionRequestApplyCommandGrantToUsers extends TeaModel {
        /**
         * <p>The account type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The expiration date of the permission. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31</p>
         */
        @NameInMap("PeriodEnd")
        public String periodEnd;

        /**
         * <p>The type of the permission validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>DAYS_30</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        /**
         * <p>The project ID of the production account. This parameter is required when the account type is PRODUCE.</p>
         * 
         * <strong>example:</strong>
         * <p>7298904510790528</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300001186</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ApplyResourcePermissionRequestApplyCommandGrantToUsers build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourcePermissionRequestApplyCommandGrantToUsers self = new ApplyResourcePermissionRequestApplyCommandGrantToUsers();
            return TeaModel.build(map, self);
        }

        public ApplyResourcePermissionRequestApplyCommandGrantToUsers setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ApplyResourcePermissionRequestApplyCommandGrantToUsers setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public ApplyResourcePermissionRequestApplyCommandGrantToUsers setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public ApplyResourcePermissionRequestApplyCommandGrantToUsers setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ApplyResourcePermissionRequestApplyCommandGrantToUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ApplyResourcePermissionRequestApplyCommandResourceList extends TeaModel {
        /**
         * <p>The list of column names specified for column-level permissions. This parameter is required when the granularity is COLUMN.</p>
         */
        @NameInMap("ColumnList")
        public java.util.List<String> columnList;

        /**
         * <p>The resource ID, which is the GUID of the table metadata.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_ds_table_xxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static ApplyResourcePermissionRequestApplyCommandResourceList build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourcePermissionRequestApplyCommandResourceList self = new ApplyResourcePermissionRequestApplyCommandResourceList();
            return TeaModel.build(map, self);
        }

        public ApplyResourcePermissionRequestApplyCommandResourceList setColumnList(java.util.List<String> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        public ApplyResourcePermissionRequestApplyCommandResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class ApplyResourcePermissionRequestApplyCommand extends TeaModel {
        /**
         * <p>The list of users to whom permissions are granted.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GrantToUsers")
        public java.util.List<ApplyResourcePermissionRequestApplyCommandGrantToUsers> grantToUsers;

        /**
         * <p>The permission granularity. Valid values: TABLE (table-level permissions) and COLUMN (column-level permissions).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The list of operation types.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("OperateList")
        public java.util.List<String> operateList;

        /**
         * <p>The reason for the application. This parameter is required and cannot be empty or contain only whitespace characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The list of resources for which permissions are applied.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<ApplyResourcePermissionRequestApplyCommandResourceList> resourceList;

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ApplyResourcePermissionRequestApplyCommand build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourcePermissionRequestApplyCommand self = new ApplyResourcePermissionRequestApplyCommand();
            return TeaModel.build(map, self);
        }

        public ApplyResourcePermissionRequestApplyCommand setGrantToUsers(java.util.List<ApplyResourcePermissionRequestApplyCommandGrantToUsers> grantToUsers) {
            this.grantToUsers = grantToUsers;
            return this;
        }
        public java.util.List<ApplyResourcePermissionRequestApplyCommandGrantToUsers> getGrantToUsers() {
            return this.grantToUsers;
        }

        public ApplyResourcePermissionRequestApplyCommand setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public ApplyResourcePermissionRequestApplyCommand setOperateList(java.util.List<String> operateList) {
            this.operateList = operateList;
            return this;
        }
        public java.util.List<String> getOperateList() {
            return this.operateList;
        }

        public ApplyResourcePermissionRequestApplyCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ApplyResourcePermissionRequestApplyCommand setResourceList(java.util.List<ApplyResourcePermissionRequestApplyCommandResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<ApplyResourcePermissionRequestApplyCommandResourceList> getResourceList() {
            return this.resourceList;
        }

        public ApplyResourcePermissionRequestApplyCommand setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
