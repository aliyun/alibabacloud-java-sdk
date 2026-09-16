// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskByRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hpdfkc6utbaq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The execution priority of the synchronization task. Synchronization tasks are executed in descending order of priority. Synchronization tasks with the same priority are executed in random order.</p>
     * <p>Valid values: 1 to 5.</p>
     * <p>Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The image repository ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-hnoq7j93or3k****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The synchronization rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crsr-o8n4dijbumgq****</p>
     */
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    /**
     * <p>The image version to be synchronized.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.24</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static CreateRepoSyncTaskByRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskByRuleRequest self = new CreateRepoSyncTaskByRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskByRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoSyncTaskByRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateRepoSyncTaskByRuleRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepoSyncTaskByRuleRequest setSyncRuleId(String syncRuleId) {
        this.syncRuleId = syncRuleId;
        return this;
    }
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

    public CreateRepoSyncTaskByRuleRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
