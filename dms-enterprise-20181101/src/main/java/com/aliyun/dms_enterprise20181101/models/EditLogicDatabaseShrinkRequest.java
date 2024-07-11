// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditLogicDatabaseShrinkRequest extends TeaModel {
    /**
     * <ul>
     * <li>The alias of the logical database. If you want to change the alias, specify a new alias.</li>
     * <li>If you do not need to change the alias of the logical database, call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getlogicdatabase">GetLogicDatabase</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getdbtopology">GetDBTopology</a> operation to query the alias of the logical database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_logic_db</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <ul>
     * <li>The IDs of the physical databases that compose the logical database. If you want to change the physical databases, you can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listdatabases">ListDatabases</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase">SearchDatabase</a> operation to query the IDs of the new physical databases that you want to specify.</li>
     * <li>If you do not want to change the physical databases, you can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getdbtopology">GetDBTopology</a> operation to query the IDs of the physical databases that compose the logical database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseIds")
    public String databaseIdsShrink;

    /**
     * <p>The ID of the logical database. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listlogicdatabases">ListLogicDatabases</a> operation to query the ID of the logical database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("LogicDbId")
    public Long logicDbId;

    /**
     * <p>The ID of the tenant. </p>
     * <blockquote>
     * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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
