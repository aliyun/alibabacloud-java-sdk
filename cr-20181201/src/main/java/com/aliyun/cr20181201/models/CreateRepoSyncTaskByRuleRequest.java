// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskByRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("SyncRuleId")
    public String syncRuleId;

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

    public CreateRepoSyncTaskByRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
