// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudPermissionTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of cloud permission templates.</p>
     */
    @NameInMap("CloudPermissionTemplates")
    public java.util.List<ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates> cloudPermissionTemplates;

    /**
     * <p>The maximum number of items per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token returned by the current call for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCloudPermissionTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudPermissionTemplatesResponseBody self = new ListCloudPermissionTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudPermissionTemplatesResponseBody setCloudPermissionTemplates(java.util.List<ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates> cloudPermissionTemplates) {
        this.cloudPermissionTemplates = cloudPermissionTemplates;
        return this;
    }
    public java.util.List<ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates> getCloudPermissionTemplates() {
        return this.cloudPermissionTemplates;
    }

    public ListCloudPermissionTemplatesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCloudPermissionTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCloudPermissionTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudPermissionTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope extends TeaModel {
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
         * <p>custom</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The list of specified user IDs. This parameter has a value only when ScopeType is set to custom.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope build(java.util.Map<String, ?> map) throws Exception {
            ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope self = new ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope();
            return TeaModel.build(map, self);
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator extends TeaModel {
        /**
         * <p>The identity identifier of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>user_01kmek49aq4r8gxxxx</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
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

        public static ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator build(java.util.Map<String, ?> map) throws Exception {
            ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator self = new ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator();
            return TeaModel.build(map, self);
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

    }

    public static class ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult extends TeaModel {
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
         * <p>Permission template initialization failed. Try again later</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The initialization result. Valid values: success and failed.</p>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        @NameInMap("Result")
        public String result;

        public static ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult build(java.util.Map<String, ?> map) throws Exception {
            ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult self = new ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult();
            return TeaModel.build(map, self);
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates extends TeaModel {
        /**
         * <p>Specifies whether users are allowed to apply for the permission template.</p>
         */
        @NameInMap("AllowRequest")
        public Boolean allowRequest;

        /**
         * <p>The applicable scope of the permission template.</p>
         */
        @NameInMap("ApplicableScope")
        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope applicableScope;

        /**
         * <p>The ID of the cloud account to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The creator information of the permission template.</p>
         */
        @NameInMap("CloudPermissionTemplateCreator")
        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator cloudPermissionTemplateCreator;

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
        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult cloudPermissionTemplateInitResult;

        /**
         * <p>The name of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>AdminAccessTemplate</p>
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
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>Administrator permission template for managing cloud accounts</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The external unique identifier of the associated cloud role, which is the role ARN on the cloud provider side.</p>
         * 
         * <strong>example:</strong>
         * <p>ReadOnlyAccess</p>
         */
        @NameInMap("PermissionEntityExternalId")
        public String permissionEntityExternalId;

        /**
         * <p>The ID of the associated CloudAccountRole.</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aq4r8gxxxx</p>
         */
        @NameInMap("PermissionEntityId")
        public String permissionEntityId;

        /**
         * <p>The type of the permission entity. Fixed value: cloud_account_role.</p>
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
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates self = new ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates();
            return TeaModel.build(map, self);
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setAllowRequest(Boolean allowRequest) {
            this.allowRequest = allowRequest;
            return this;
        }
        public Boolean getAllowRequest() {
            return this.allowRequest;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setApplicableScope(ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope applicableScope) {
            this.applicableScope = applicableScope;
            return this;
        }
        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesApplicableScope getApplicableScope() {
            return this.applicableScope;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateCreator(ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator cloudPermissionTemplateCreator) {
            this.cloudPermissionTemplateCreator = cloudPermissionTemplateCreator;
            return this;
        }
        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateCreator getCloudPermissionTemplateCreator() {
            return this.cloudPermissionTemplateCreator;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
            this.cloudPermissionTemplateId = cloudPermissionTemplateId;
            return this;
        }
        public String getCloudPermissionTemplateId() {
            return this.cloudPermissionTemplateId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateInitResult(ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult cloudPermissionTemplateInitResult) {
            this.cloudPermissionTemplateInitResult = cloudPermissionTemplateInitResult;
            return this;
        }
        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplatesCloudPermissionTemplateInitResult getCloudPermissionTemplateInitResult() {
            return this.cloudPermissionTemplateInitResult;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateName(String cloudPermissionTemplateName) {
            this.cloudPermissionTemplateName = cloudPermissionTemplateName;
            return this;
        }
        public String getCloudPermissionTemplateName() {
            return this.cloudPermissionTemplateName;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateOwnerId(String cloudPermissionTemplateOwnerId) {
            this.cloudPermissionTemplateOwnerId = cloudPermissionTemplateOwnerId;
            return this;
        }
        public String getCloudPermissionTemplateOwnerId() {
            return this.cloudPermissionTemplateOwnerId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateOwnerType(String cloudPermissionTemplateOwnerType) {
            this.cloudPermissionTemplateOwnerType = cloudPermissionTemplateOwnerType;
            return this;
        }
        public String getCloudPermissionTemplateOwnerType() {
            return this.cloudPermissionTemplateOwnerType;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateSharingMode(String cloudPermissionTemplateSharingMode) {
            this.cloudPermissionTemplateSharingMode = cloudPermissionTemplateSharingMode;
            return this;
        }
        public String getCloudPermissionTemplateSharingMode() {
            return this.cloudPermissionTemplateSharingMode;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCloudPermissionTemplateUsageType(String cloudPermissionTemplateUsageType) {
            this.cloudPermissionTemplateUsageType = cloudPermissionTemplateUsageType;
            return this;
        }
        public String getCloudPermissionTemplateUsageType() {
            return this.cloudPermissionTemplateUsageType;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setPermissionEntityExternalId(String permissionEntityExternalId) {
            this.permissionEntityExternalId = permissionEntityExternalId;
            return this;
        }
        public String getPermissionEntityExternalId() {
            return this.permissionEntityExternalId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setPermissionEntityId(String permissionEntityId) {
            this.permissionEntityId = permissionEntityId;
            return this;
        }
        public String getPermissionEntityId() {
            return this.permissionEntityId;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setPermissionEntityType(String permissionEntityType) {
            this.permissionEntityType = permissionEntityType;
            return this;
        }
        public String getPermissionEntityType() {
            return this.permissionEntityType;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloudPermissionTemplatesResponseBodyCloudPermissionTemplates setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
