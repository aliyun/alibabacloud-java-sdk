// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class MigrateResourceInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the destination resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-asdasdasd****</p>
     */
    @NameInMap("DestResourceId")
    public String destResourceId;

    /**
     * <p>The IDs of the instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>Specifies whether to migrate the instances to a general computing resource group. If set to true, specify the ID of the general computing resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MigrateToHybrid")
    public Boolean migrateToHybrid;

    public static MigrateResourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceInstanceRequest self = new MigrateResourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public MigrateResourceInstanceRequest setDestResourceId(String destResourceId) {
        this.destResourceId = destResourceId;
        return this;
    }
    public String getDestResourceId() {
        return this.destResourceId;
    }

    public MigrateResourceInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public MigrateResourceInstanceRequest setMigrateToHybrid(Boolean migrateToHybrid) {
        this.migrateToHybrid = migrateToHybrid;
        return this;
    }
    public Boolean getMigrateToHybrid() {
        return this.migrateToHybrid;
    }

}
