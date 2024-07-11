// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLogicDatabaseShrinkRequest extends TeaModel {
    /**
     * <p>The alias of the logical database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_logic_db</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <p>The IDs of the physical databases that compose the logical database. You can specify one or more database IDs. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listdatabases">ListDatabases</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase">SearchDatabase</a> operation to query the IDs of the physical databases.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseIds")
    public String databaseIdsShrink;

    /**
     * <p>The ID of the tenant. </p>
     * <blockquote>
     * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateLogicDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicDatabaseShrinkRequest self = new CreateLogicDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogicDatabaseShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateLogicDatabaseShrinkRequest setDatabaseIdsShrink(String databaseIdsShrink) {
        this.databaseIdsShrink = databaseIdsShrink;
        return this;
    }
    public String getDatabaseIdsShrink() {
        return this.databaseIdsShrink;
    }

    public CreateLogicDatabaseShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
