// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudPermissionTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether users are allowed to apply for the permission template. Default value: true.</p>
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
    public CreateCloudPermissionTemplateRequestApplicableScope applicableScope;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The list of cloud account resource policies.</p>
     */
    @NameInMap("CloudAccountResources")
    public java.util.List<CreateCloudPermissionTemplateRequestCloudAccountResources> cloudAccountResources;

    /**
     * <p>The name of the permission template. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("CloudPermissionTemplateName")
    public String cloudPermissionTemplateName;

    /**
     * <p>The usage type of the permission template. Valid values:</p>
     * <ul>
     * <li>user: Privilege escalation for human users.</li>
     * <li>application: Privilege escalation for M2M applications.
     * Default value: user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("CloudPermissionTemplateUsageType")
    public String cloudPermissionTemplateUsageType;

    /**
     * <p>The description of the permission template. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test.</p>
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

    public static CreateCloudPermissionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPermissionTemplateRequest self = new CreateCloudPermissionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudPermissionTemplateRequest setAllowRequest(Boolean allowRequest) {
        this.allowRequest = allowRequest;
        return this;
    }
    public Boolean getAllowRequest() {
        return this.allowRequest;
    }

    public CreateCloudPermissionTemplateRequest setApplicableScope(CreateCloudPermissionTemplateRequestApplicableScope applicableScope) {
        this.applicableScope = applicableScope;
        return this;
    }
    public CreateCloudPermissionTemplateRequestApplicableScope getApplicableScope() {
        return this.applicableScope;
    }

    public CreateCloudPermissionTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudPermissionTemplateRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public CreateCloudPermissionTemplateRequest setCloudAccountResources(java.util.List<CreateCloudPermissionTemplateRequestCloudAccountResources> cloudAccountResources) {
        this.cloudAccountResources = cloudAccountResources;
        return this;
    }
    public java.util.List<CreateCloudPermissionTemplateRequestCloudAccountResources> getCloudAccountResources() {
        return this.cloudAccountResources;
    }

    public CreateCloudPermissionTemplateRequest setCloudPermissionTemplateName(String cloudPermissionTemplateName) {
        this.cloudPermissionTemplateName = cloudPermissionTemplateName;
        return this;
    }
    public String getCloudPermissionTemplateName() {
        return this.cloudPermissionTemplateName;
    }

    public CreateCloudPermissionTemplateRequest setCloudPermissionTemplateUsageType(String cloudPermissionTemplateUsageType) {
        this.cloudPermissionTemplateUsageType = cloudPermissionTemplateUsageType;
        return this;
    }
    public String getCloudPermissionTemplateUsageType() {
        return this.cloudPermissionTemplateUsageType;
    }

    public CreateCloudPermissionTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudPermissionTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class CreateCloudPermissionTemplateRequestApplicableScope extends TeaModel {
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
         * <p>The type of the applicable scope. Valid values: global and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The list of user IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateCloudPermissionTemplateRequestApplicableScope build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPermissionTemplateRequestApplicableScope self = new CreateCloudPermissionTemplateRequestApplicableScope();
            return TeaModel.build(map, self);
        }

        public CreateCloudPermissionTemplateRequestApplicableScope setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public CreateCloudPermissionTemplateRequestApplicableScope setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public CreateCloudPermissionTemplateRequestApplicableScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public CreateCloudPermissionTemplateRequestApplicableScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class CreateCloudPermissionTemplateRequestCloudAccountResources extends TeaModel {
        /**
         * <p>The ID of the cloud account resource.</p>
         * 
         * <strong>example:</strong>
         * <p>car_01l8a1l906kqtkacdfp5dxxxxx</p>
         */
        @NameInMap("CloudAccountResourceId")
        public String cloudAccountResourceId;

        public static CreateCloudPermissionTemplateRequestCloudAccountResources build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPermissionTemplateRequestCloudAccountResources self = new CreateCloudPermissionTemplateRequestCloudAccountResources();
            return TeaModel.build(map, self);
        }

        public CreateCloudPermissionTemplateRequestCloudAccountResources setCloudAccountResourceId(String cloudAccountResourceId) {
            this.cloudAccountResourceId = cloudAccountResourceId;
            return this;
        }
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

    }

}
