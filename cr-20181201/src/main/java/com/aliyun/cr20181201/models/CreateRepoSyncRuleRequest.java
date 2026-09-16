// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncRuleRequest extends TeaModel {
    /**
     * <p>The ID of the source instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hpdfkc6utbaq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the custom synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>stl-72cjfd3fayno8***</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The namespace name of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The instance-level namespace regex filter.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SyncScope is set to <code>INSTANCE</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("NamespaceNameFilter")
    public String namespaceNameFilter;

    /**
     * <p>The execution priority of the synchronization task. Synchronization tasks are executed in descending order of priority. Tasks with the same priority are executed in random order.</p>
     * <p>Valid values: 1 to 5.</p>
     * <p>Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The repository name of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The repository filter rule.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SyncScope is set to <code>INSTANCE</code> or <code>NAMESPACE</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("RepoNameFilter")
    public String repoNameFilter;

    /**
     * <p>The name of the synchronization rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("SyncRuleName")
    public String syncRuleName;

    /**
     * <p>The synchronization type. Valid values:</p>
     * <ul>
     * <li><p><code>REPO</code>: Synchronizes by image repository.</p>
     * </li>
     * <li><p><code>NAMESPACE</code>: Synchronizes by namespace.</p>
     * </li>
     * <li><p><code>INSTANCE</code>: Synchronizes by namespace regex and repository regex.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPO</p>
     */
    @NameInMap("SyncScope")
    public String syncScope;

    /**
     * <p>The trigger for the synchronization action. Valid values:</p>
     * <ul>
     * <li><p><code>INITIATIVE</code>: Manual trigger.</p>
     * </li>
     * <li><p><code>PASSIVE</code>: Automatic trigger.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PASSIVE</p>
     */
    @NameInMap("SyncTrigger")
    public String syncTrigger;

    /**
     * <p>The tag filter rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("TagFilter")
    public String tagFilter;

    /**
     * <p>The ID of the target instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-ibxs3piklys3****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The namespace name of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("TargetNamespaceName")
    public String targetNamespaceName;

    /**
     * <p>The region ID of the target instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("TargetRegionId")
    public String targetRegionId;

    /**
     * <p>The image repository name of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("TargetRepoName")
    public String targetRepoName;

    /**
     * <p>The UID of the account to which the target instance belongs.</p>
     * <blockquote>
     * <p>This parameter is required for cross-account image synchronization.</p>
     * </blockquote>
     * 
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

    public CreateRepoSyncRuleRequest setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public CreateRepoSyncRuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateRepoSyncRuleRequest setNamespaceNameFilter(String namespaceNameFilter) {
        this.namespaceNameFilter = namespaceNameFilter;
        return this;
    }
    public String getNamespaceNameFilter() {
        return this.namespaceNameFilter;
    }

    public CreateRepoSyncRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
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
