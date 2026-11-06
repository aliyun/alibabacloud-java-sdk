// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudPermissionTemplateResponseBody extends TeaModel {
    /**
     * <p>The permission template.</p>
     */
    @NameInMap("CloudPermissionTemplate")
    public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate cloudPermissionTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudPermissionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudPermissionTemplateResponseBody self = new GetCloudPermissionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudPermissionTemplateResponseBody setCloudPermissionTemplate(GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate cloudPermissionTemplate) {
        this.cloudPermissionTemplate = cloudPermissionTemplate;
        return this;
    }
    public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate getCloudPermissionTemplate() {
        return this.cloudPermissionTemplate;
    }

    public GetCloudPermissionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope extends TeaModel {
        /**
         * <p>The list of specified group IDs. This parameter has a value only when ScopeType is set to custom.</p>
         */
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        /**
         * <p>The list of specified organizational unit IDs. This parameter has a value only when ScopeType is set to custom.</p>
         */
        @NameInMap("OrganizationalUnitIds")
        public java.util.List<String> organizationalUnitIds;

        /**
         * <p>The type of the applicable scope. Valid values: global and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The list of specified user IDs. This parameter has a value only when ScopeType is set to custom.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope build(java.util.Map<String, ?> map) throws Exception {
            GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope self = new GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope();
            return TeaModel.build(map, self);
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator extends TeaModel {
        /**
         * <p>The identity identifier of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>8645321</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The type of the creator. Valid values: idaas_admin and idaas_user.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_user</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        public static GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator build(java.util.Map<String, ?> map) throws Exception {
            GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator self = new GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator();
            return TeaModel.build(map, self);
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

    }

    public static class GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult extends TeaModel {
        /**
         * <p>The error code returned when initialization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudPermissionTemplate.AsyncInitError</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when initialization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>server error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The initialization result. Valid values: success and failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult build(java.util.Map<String, ?> map) throws Exception {
            GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult self = new GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult();
            return TeaModel.build(map, self);
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate extends TeaModel {
        /**
         * <p>Specifies whether users are allowed to request the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowRequest")
        public Boolean allowRequest;

        /**
         * <p>The applicable scope of the permission template.</p>
         */
        @NameInMap("ApplicableScope")
        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope applicableScope;

        /**
         * <p>The ID of the cloud account to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kq1us6frlbo3rr8m216vj3bkak2</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The creator information of the permission template.</p>
         */
        @NameInMap("CloudPermissionTemplateCreator")
        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator cloudPermissionTemplateCreator;

        /**
         * <p>The unique identifier of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_01l8dagf2iablhigj75l1n99xxxxx</p>
         */
        @NameInMap("CloudPermissionTemplateId")
        public String cloudPermissionTemplateId;

        /**
         * <p>The initialization result. This parameter is returned only when the status is init_failed.</p>
         */
        @NameInMap("CloudPermissionTemplateInitResult")
        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult cloudPermissionTemplateInitResult;

        /**
         * <p>The name of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("CloudPermissionTemplateName")
        public String cloudPermissionTemplateName;

        /**
         * <p>The ID of the application to which the exclusive template belongs. This parameter is empty for shared templates.</p>
         * 
         * <strong>example:</strong>
         * <p>user_01kexamplexxxx</p>
         */
        @NameInMap("CloudPermissionTemplateOwnerId")
        public String cloudPermissionTemplateOwnerId;

        /**
         * <p>The owner type of the exclusive template. Valid values: application (M2M applications) and user (human users). This parameter is empty for shared templates.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("CloudPermissionTemplateOwnerType")
        public String cloudPermissionTemplateOwnerType;

        /**
         * <p>The sharing mode of the permission template. Valid values: shared and exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("CloudPermissionTemplateSharingMode")
        public String cloudPermissionTemplateSharingMode;

        /**
         * <p>The usage type of the permission template. Valid values: user (privilege escalation for human users) and application (privilege escalation for M2M applications).</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("CloudPermissionTemplateUsageType")
        public String cloudPermissionTemplateUsageType;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1776239357000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ki6hd7ihir4ybawogqk6kqsfjm</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The external unique identifier of the associated cloud role, which is the ARN of the role on the cloud provider side.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/idaas-test</p>
         */
        @NameInMap("PermissionEntityExternalId")
        public String permissionEntityExternalId;

        /**
         * <p>The ID of the associated CloudAccountRole.</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        @NameInMap("PermissionEntityId")
        public String permissionEntityId;

        /**
         * <p>The permission entity type. Fixed value: cloud_account_role.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_account_role</p>
         */
        @NameInMap("PermissionEntityType")
        public String permissionEntityType;

        /**
         * <p>The status of the permission template. Valid values: initializing, init_failed, enabled, and disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1776239357000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate self = new GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate();
            return TeaModel.build(map, self);
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setAllowRequest(Boolean allowRequest) {
            this.allowRequest = allowRequest;
            return this;
        }
        public Boolean getAllowRequest() {
            return this.allowRequest;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setApplicableScope(GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope applicableScope) {
            this.applicableScope = applicableScope;
            return this;
        }
        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateApplicableScope getApplicableScope() {
            return this.applicableScope;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateCreator(GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator cloudPermissionTemplateCreator) {
            this.cloudPermissionTemplateCreator = cloudPermissionTemplateCreator;
            return this;
        }
        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateCreator getCloudPermissionTemplateCreator() {
            return this.cloudPermissionTemplateCreator;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
            this.cloudPermissionTemplateId = cloudPermissionTemplateId;
            return this;
        }
        public String getCloudPermissionTemplateId() {
            return this.cloudPermissionTemplateId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateInitResult(GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult cloudPermissionTemplateInitResult) {
            this.cloudPermissionTemplateInitResult = cloudPermissionTemplateInitResult;
            return this;
        }
        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplateCloudPermissionTemplateInitResult getCloudPermissionTemplateInitResult() {
            return this.cloudPermissionTemplateInitResult;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateName(String cloudPermissionTemplateName) {
            this.cloudPermissionTemplateName = cloudPermissionTemplateName;
            return this;
        }
        public String getCloudPermissionTemplateName() {
            return this.cloudPermissionTemplateName;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateOwnerId(String cloudPermissionTemplateOwnerId) {
            this.cloudPermissionTemplateOwnerId = cloudPermissionTemplateOwnerId;
            return this;
        }
        public String getCloudPermissionTemplateOwnerId() {
            return this.cloudPermissionTemplateOwnerId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateOwnerType(String cloudPermissionTemplateOwnerType) {
            this.cloudPermissionTemplateOwnerType = cloudPermissionTemplateOwnerType;
            return this;
        }
        public String getCloudPermissionTemplateOwnerType() {
            return this.cloudPermissionTemplateOwnerType;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateSharingMode(String cloudPermissionTemplateSharingMode) {
            this.cloudPermissionTemplateSharingMode = cloudPermissionTemplateSharingMode;
            return this;
        }
        public String getCloudPermissionTemplateSharingMode() {
            return this.cloudPermissionTemplateSharingMode;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCloudPermissionTemplateUsageType(String cloudPermissionTemplateUsageType) {
            this.cloudPermissionTemplateUsageType = cloudPermissionTemplateUsageType;
            return this;
        }
        public String getCloudPermissionTemplateUsageType() {
            return this.cloudPermissionTemplateUsageType;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setPermissionEntityExternalId(String permissionEntityExternalId) {
            this.permissionEntityExternalId = permissionEntityExternalId;
            return this;
        }
        public String getPermissionEntityExternalId() {
            return this.permissionEntityExternalId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setPermissionEntityId(String permissionEntityId) {
            this.permissionEntityId = permissionEntityId;
            return this;
        }
        public String getPermissionEntityId() {
            return this.permissionEntityId;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setPermissionEntityType(String permissionEntityType) {
            this.permissionEntityType = permissionEntityType;
            return this;
        }
        public String getPermissionEntityType() {
            return this.permissionEntityType;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCloudPermissionTemplateResponseBodyCloudPermissionTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
