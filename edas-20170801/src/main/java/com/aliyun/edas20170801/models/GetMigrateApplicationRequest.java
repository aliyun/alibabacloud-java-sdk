// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMigrateApplicationRequest extends TeaModel {
    /**
     * <p>The migration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>afe9995d-31fd-40ff-a669-c125d76d8267</p>
     */
    @NameInMap("migrationId")
    public String migrationId;

    /**
     * <p>The operation type of the migration task. Valid values: 1: import. 2: export. 3: clone. If this parameter is not specified, all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("migrationType")
    public Long migrationType;

    /**
     * <p>regionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetMigrateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMigrateApplicationRequest self = new GetMigrateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetMigrateApplicationRequest setMigrationId(String migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public String getMigrationId() {
        return this.migrationId;
    }

    public GetMigrateApplicationRequest setMigrationType(Long migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public Long getMigrationType() {
        return this.migrationType;
    }

    public GetMigrateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
