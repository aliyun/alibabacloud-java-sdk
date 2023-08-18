// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ShrinkClusterRequest extends TeaModel {
    @NameInMap("instanceIds")
    public String instanceIds;

    @NameInMap("modelTargetCount")
    public String modelTargetCount;

    public static ShrinkClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ShrinkClusterRequest self = new ShrinkClusterRequest();
        return TeaModel.build(map, self);
    }

    public ShrinkClusterRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ShrinkClusterRequest setModelTargetCount(String modelTargetCount) {
        this.modelTargetCount = modelTargetCount;
        return this;
    }
    public String getModelTargetCount() {
        return this.modelTargetCount;
    }

}
