// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateEcuRequest extends TeaModel {
    /**
     * <p>The IDs of the instances. To specify multiple instances, separate the IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zej4i2jdf3ntwhj****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The ID of the namespace.</p>
     * <ul>
     * <li><p>A custom namespace ID is in the format <code>Region ID:Namespace identifier</code>. Example: cn-beijing:tdy218.</p>
     * </li>
     * <li><p>A default namespace ID is the same as its region ID. Example: cn-beijing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou:test_region</p>
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
