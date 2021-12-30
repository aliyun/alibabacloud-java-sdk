// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoSyncRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SyncRuleId")
    public String syncRuleId;

    public static DeleteRepoSyncRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoSyncRuleRequest self = new DeleteRepoSyncRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepoSyncRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteRepoSyncRuleRequest setSyncRuleId(String syncRuleId) {
        this.syncRuleId = syncRuleId;
        return this;
    }
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

}
