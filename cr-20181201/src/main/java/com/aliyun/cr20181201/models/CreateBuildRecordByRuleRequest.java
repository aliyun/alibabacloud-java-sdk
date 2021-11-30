// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateBuildRecordByRuleRequest extends TeaModel {
    @NameInMap("BuildRuleId")
    public String buildRuleId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    public static CreateBuildRecordByRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildRecordByRuleRequest self = new CreateBuildRecordByRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuildRecordByRuleRequest setBuildRuleId(String buildRuleId) {
        this.buildRuleId = buildRuleId;
        return this;
    }
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    public CreateBuildRecordByRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBuildRecordByRuleRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
