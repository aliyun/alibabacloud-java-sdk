// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLogicDatabaseRequest extends TeaModel {
    /**
     * <p>The alias of the logical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <p>The IDs of the physical databases that compose the logical database. You can specify one or more database IDs. You can call the [ListDatabases](https://www.alibabacloud.com/help/en/data-management-service/latest/listdatabases) or [SearchDatabase](https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase) operation to query the IDs of the physical databases.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseIds")
    public java.util.List<Long> databaseIds;

    /**
     * <p>The ID of the tenant. </p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicDatabaseRequest self = new CreateLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogicDatabaseRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateLogicDatabaseRequest setDatabaseIds(java.util.List<Long> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<Long> getDatabaseIds() {
        return this.databaseIds;
    }

    public CreateLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
