// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudPermissionTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether users are allowed to apply.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowRequest")
    public Boolean allowRequest;

    /**
     * <p>The applicable scope of the permission template, including the scope type and specified users, groups, or organizational units.</p>
     */
    @NameInMap("ApplicableScope")
    public UpdateCloudPermissionTemplateRequestApplicableScope applicableScope;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The list of cloud account resources.</p>
     */
    @NameInMap("CloudAccountResources")
    public java.util.List<UpdateCloudPermissionTemplateRequestCloudAccountResources> cloudAccountResources;

    /**
     * <p>The permission template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("CloudPermissionTemplateId")
    public String cloudPermissionTemplateId;

    /**
     * <p>The name of the permission template. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>dev-default</p>
     */
    @NameInMap("CloudPermissionTemplateName")
    public String cloudPermissionTemplateName;

    /**
     * <p>The description of the permission template. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_for_test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudPermissionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudPermissionTemplateRequest self = new UpdateCloudPermissionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudPermissionTemplateRequest setAllowRequest(Boolean allowRequest) {
        this.allowRequest = allowRequest;
        return this;
    }
    public Boolean getAllowRequest() {
        return this.allowRequest;
    }

    public UpdateCloudPermissionTemplateRequest setApplicableScope(UpdateCloudPermissionTemplateRequestApplicableScope applicableScope) {
        this.applicableScope = applicableScope;
        return this;
    }
    public UpdateCloudPermissionTemplateRequestApplicableScope getApplicableScope() {
        return this.applicableScope;
    }

    public UpdateCloudPermissionTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudPermissionTemplateRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public UpdateCloudPermissionTemplateRequest setCloudAccountResources(java.util.List<UpdateCloudPermissionTemplateRequestCloudAccountResources> cloudAccountResources) {
        this.cloudAccountResources = cloudAccountResources;
        return this;
    }
    public java.util.List<UpdateCloudPermissionTemplateRequestCloudAccountResources> getCloudAccountResources() {
        return this.cloudAccountResources;
    }

    public UpdateCloudPermissionTemplateRequest setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
        this.cloudPermissionTemplateId = cloudPermissionTemplateId;
        return this;
    }
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    public UpdateCloudPermissionTemplateRequest setCloudPermissionTemplateName(String cloudPermissionTemplateName) {
        this.cloudPermissionTemplateName = cloudPermissionTemplateName;
        return this;
    }
    public String getCloudPermissionTemplateName() {
        return this.cloudPermissionTemplateName;
    }

    public UpdateCloudPermissionTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCloudPermissionTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class UpdateCloudPermissionTemplateRequestApplicableScope extends TeaModel {
        /**
         * <p>The list of group IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsusdfa4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        /**
         * <p>The list of organizational unit IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_d6sbsuudfgf4h66ec3il7yxxxx</p>
         */
        @NameInMap("OrganizationalUnitIds")
        public java.util.List<String> organizationalUnitIds;

        /**
         * <p>The application scope type. Valid values: global and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The list of account IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateCloudPermissionTemplateRequestApplicableScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudPermissionTemplateRequestApplicableScope self = new UpdateCloudPermissionTemplateRequestApplicableScope();
            return TeaModel.build(map, self);
        }

        public UpdateCloudPermissionTemplateRequestApplicableScope setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public UpdateCloudPermissionTemplateRequestApplicableScope setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public UpdateCloudPermissionTemplateRequestApplicableScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public UpdateCloudPermissionTemplateRequestApplicableScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class UpdateCloudPermissionTemplateRequestCloudAccountResources extends TeaModel {
        /**
         * <p>The cloud account resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>car_01lap4os3aaerckla05vftnsl8edo</p>
         */
        @NameInMap("CloudAccountResourceId")
        public String cloudAccountResourceId;

        public static UpdateCloudPermissionTemplateRequestCloudAccountResources build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudPermissionTemplateRequestCloudAccountResources self = new UpdateCloudPermissionTemplateRequestCloudAccountResources();
            return TeaModel.build(map, self);
        }

        public UpdateCloudPermissionTemplateRequestCloudAccountResources setCloudAccountResourceId(String cloudAccountResourceId) {
            this.cloudAccountResourceId = cloudAccountResourceId;
            return this;
        }
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

    }

}
