// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class BatchAddEnvironmentNodesRequest extends TeaModel {
    @NameInMap("instanceList")
    public java.util.List<InstanceInfo> instanceList;

    // 是否覆盖
    @NameInMap("overwrite")
    public Boolean overwrite;

    public static BatchAddEnvironmentNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddEnvironmentNodesRequest self = new BatchAddEnvironmentNodesRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddEnvironmentNodesRequest setInstanceList(java.util.List<InstanceInfo> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<InstanceInfo> getInstanceList() {
        return this.instanceList;
    }

    public BatchAddEnvironmentNodesRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
