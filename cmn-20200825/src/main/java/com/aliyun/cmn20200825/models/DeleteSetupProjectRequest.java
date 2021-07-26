// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteSetupProjectRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static DeleteSetupProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSetupProjectRequest self = new DeleteSetupProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSetupProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSetupProjectRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}
