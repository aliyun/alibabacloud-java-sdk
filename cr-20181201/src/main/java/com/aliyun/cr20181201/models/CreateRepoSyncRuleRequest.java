// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hpdfkc6utbaq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The rule that is used to filter repositories.</p>
     * <blockquote>
     * <p> This parameter is valid only when SyncScope is set to <code>NAMESPACE</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("RepoNameFilter")
    public String repoNameFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("SyncRuleName")
    public String syncRuleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPO</p>
     */
    @NameInMap("SyncScope")
    public String syncScope;

    /**
     * <strong>example:</strong>
     * <p>PASSIVE</p>
     */
    @NameInMap("SyncTrigger")
    public String syncTrigger;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("TagFilter")
    public String tagFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-ibxs3piklys3****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("TargetNamespaceName")
    public String targetNamespaceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("TargetRegionId")
    public String targetRegionId;

    /**
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("TargetRepoName")
    public String targetRepoName;

    /**
     * <strong>example:</strong>
     * <p>12645940***</p>
     */
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

    public CreateRepoSyncRuleRequest setRepoNameFilter(String repoNameFilter) {
        this.repoNameFilter = repoNameFilter;
        return this;
    }
    public String getRepoNameFilter() {
        return this.repoNameFilter;
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
