// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MigrationStatusFilter extends TeaModel {
    /**
     * <p>Specifies whether to filter by migration rule. Valid values:</p>
     * <ul>
     * <li>true: Only migrated rules (migration_status is not 0 or NULL).</li>
     * <li>false: Only native rules (migration_status = 0).</li>
     * </ul>
     */
    @NameInMap("isMigrated")
    public Boolean isMigrated;

    public static MigrationStatusFilter build(java.util.Map<String, ?> map) throws Exception {
        MigrationStatusFilter self = new MigrationStatusFilter();
        return TeaModel.build(map, self);
    }

    public MigrationStatusFilter setIsMigrated(Boolean isMigrated) {
        this.isMigrated = isMigrated;
        return this;
    }
    public Boolean getIsMigrated() {
        return this.isMigrated;
    }

}
