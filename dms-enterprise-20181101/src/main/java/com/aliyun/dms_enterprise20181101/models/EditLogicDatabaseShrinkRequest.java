// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditLogicDatabaseShrinkRequest extends TeaModel {
    // - The alias of the logical database. If you want to change the alias, specify a new alias.
    // - If you do not need to change the alias of the logical database, call the [GetLogicDatabase](https://www.alibabacloud.com/help/en/data-management-service/latest/getlogicdatabase) or [GetDBTopology](https://www.alibabacloud.com/help/en/data-management-service/latest/getdbtopology) operation to query the alias of the logical database.
    @NameInMap("Alias")
    public String alias;

    // - The IDs of the physical databases that compose the logical database. If you want to change the physical databases, you can call the [ListDatabases](https://www.alibabacloud.com/help/en/data-management-service/latest/listdatabases) or [SearchDatabase](https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase) operation to query the IDs of the new physical databases that you want to specify.
    // - If you do not want to change the physical databases, you can call the [GetDBTopology](https://www.alibabacloud.com/help/en/data-management-service/latest/getdbtopology) operation to query the IDs of the physical databases that compose the logical database.
    @NameInMap("DatabaseIds")
    public String databaseIdsShrink;

    // The ID of the logical database. You can call the [ListLogicDatabases](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogicdatabases) operation to query the ID of the logical database.
    @NameInMap("LogicDbId")
    public Long logicDbId;

    // The ID of the tenant. 
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants) topic.
    @NameInMap("Tid")
    public Long tid;

    public static EditLogicDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditLogicDatabaseShrinkRequest self = new EditLogicDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditLogicDatabaseShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EditLogicDatabaseShrinkRequest setDatabaseIdsShrink(String databaseIdsShrink) {
        this.databaseIdsShrink = databaseIdsShrink;
        return this;
    }
    public String getDatabaseIdsShrink() {
        return this.databaseIdsShrink;
    }

    public EditLogicDatabaseShrinkRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public EditLogicDatabaseShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
