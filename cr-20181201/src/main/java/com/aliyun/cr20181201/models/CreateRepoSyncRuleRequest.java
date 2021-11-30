// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("SyncRuleName")
    public String syncRuleName;

    @NameInMap("SyncScope")
    public String syncScope;

    @NameInMap("SyncTrigger")
    public String syncTrigger;

    @NameInMap("TagFilter")
    public String tagFilter;

    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    @NameInMap("TargetNamespaceName")
    public String targetNamespaceName;

    @NameInMap("TargetRegionId")
    public String targetRegionId;

    @NameInMap("TargetRepoName")
    public String targetRepoName;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static CreateRepoSyncRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncRuleRequest self = new CreateRepoSyncRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoSyncRuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateRepoSyncRuleRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateRepoSyncRuleRequest setSyncRuleName(String syncRuleName) {
        this.syncRuleName = syncRuleName;
        return this;
    }
    public String getSyncRuleName() {
        return this.syncRuleName;
    }

    public CreateRepoSyncRuleRequest setSyncScope(String syncScope) {
        this.syncScope = syncScope;
        return this;
    }
    public String getSyncScope() {
        return this.syncScope;
    }

    public CreateRepoSyncRuleRequest setSyncTrigger(String syncTrigger) {
        this.syncTrigger = syncTrigger;
        return this;
    }
    public String getSyncTrigger() {
        return this.syncTrigger;
    }

    public CreateRepoSyncRuleRequest setTagFilter(String tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public String getTagFilter() {
        return this.tagFilter;
    }

    public CreateRepoSyncRuleRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateRepoSyncRuleRequest setTargetNamespaceName(String targetNamespaceName) {
        this.targetNamespaceName = targetNamespaceName;
        return this;
    }
    public String getTargetNamespaceName() {
        return this.targetNamespaceName;
    }

    public CreateRepoSyncRuleRequest setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    public CreateRepoSyncRuleRequest setTargetRepoName(String targetRepoName) {
        this.targetRepoName = targetRepoName;
        return this;
    }
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    public CreateRepoSyncRuleRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
