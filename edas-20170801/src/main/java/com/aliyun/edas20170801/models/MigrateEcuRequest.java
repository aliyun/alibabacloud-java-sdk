// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateEcuRequest extends TeaModel {
    /**
     * <p>The ID of the ECS instance. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The ID of the custom namespace.</p>
     * <br>
     * <p>*   The ID of a custom namespace is in the `region ID:custom namespace ID` format. Example: cn-beijing:tdy218.</p>
     * <p>*   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static MigrateEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateEcuRequest self = new MigrateEcuRequest();
        return TeaModel.build(map, self);
    }

    public MigrateEcuRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public MigrateEcuRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
