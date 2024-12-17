// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunSynchronizationJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PasswordInitialization")
    public Boolean passwordInitialization;

    @NameInMap("SynchronizationScopeConfig")
    public RunSynchronizationJobRequestSynchronizationScopeConfig synchronizationScopeConfig;

    /**
     * <p>同步目标ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3ngxxxxx</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>同步目标类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>identity_provider</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("UserIdentityTypes")
    public java.util.List<String> userIdentityTypes;

    public static RunSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSynchronizationJobRequest self = new RunSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public RunSynchronizationJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunSynchronizationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunSynchronizationJobRequest setPasswordInitialization(Boolean passwordInitialization) {
        this.passwordInitialization = passwordInitialization;
        return this;
    }
    public Boolean getPasswordInitialization() {
        return this.passwordInitialization;
    }

    public RunSynchronizationJobRequest setSynchronizationScopeConfig(RunSynchronizationJobRequestSynchronizationScopeConfig synchronizationScopeConfig) {
        this.synchronizationScopeConfig = synchronizationScopeConfig;
        return this;
    }
    public RunSynchronizationJobRequestSynchronizationScopeConfig getSynchronizationScopeConfig() {
        return this.synchronizationScopeConfig;
    }

    public RunSynchronizationJobRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public RunSynchronizationJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public RunSynchronizationJobRequest setUserIdentityTypes(java.util.List<String> userIdentityTypes) {
        this.userIdentityTypes = userIdentityTypes;
        return this;
    }
    public java.util.List<String> getUserIdentityTypes() {
        return this.userIdentityTypes;
    }

    public static class RunSynchronizationJobRequestSynchronizationScopeConfig extends TeaModel {
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        @NameInMap("OrganizationalUnitIds")
        public java.util.List<String> organizationalUnitIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static RunSynchronizationJobRequestSynchronizationScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            RunSynchronizationJobRequestSynchronizationScopeConfig self = new RunSynchronizationJobRequestSynchronizationScopeConfig();
            return TeaModel.build(map, self);
        }

        public RunSynchronizationJobRequestSynchronizationScopeConfig setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public RunSynchronizationJobRequestSynchronizationScopeConfig setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        public RunSynchronizationJobRequestSynchronizationScopeConfig setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
