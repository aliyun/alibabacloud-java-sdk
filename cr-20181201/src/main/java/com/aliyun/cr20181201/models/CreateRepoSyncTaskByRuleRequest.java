// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskByRuleRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hpdfkc6utbaq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-hnoq7j93or3k****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the synchronization rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crsr-o8n4dijbumgq****</p>
     */
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    /**
     * <p>The version of the image to be synchronized.</p>
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
