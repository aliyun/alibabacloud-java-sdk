// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskByRuleRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the synchronization rule.</p>
     */
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    /**
     * <p>The version of the image to be synchronized.</p>
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
