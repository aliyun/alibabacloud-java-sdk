// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RenameSemanticViewRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1u8c0mgfg58****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The new schema name in which the semantic view resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_sv</p>
     */
    @NameInMap("NewSchemaName")
    public String newSchemaName;

    /**
     * <p>The new name of the semantic view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new_sv_name</p>
     */
    @NameInMap("NewViewName")
    public String newViewName;

    /**
     * <p>The original schema name in which the semantic view resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_sv_old</p>
     */
    @NameInMap("OldSchemaName")
    public String oldSchemaName;

    /**
     * <p>The original name of the semantic view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>old_sv_name</p>
     */
    @NameInMap("OldViewName")
    public String oldViewName;

    public static RenameSemanticViewRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameSemanticViewRequest self = new RenameSemanticViewRequest();
        return TeaModel.build(map, self);
    }

    public RenameSemanticViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RenameSemanticViewRequest setNewSchemaName(String newSchemaName) {
        this.newSchemaName = newSchemaName;
        return this;
    }
    public String getNewSchemaName() {
        return this.newSchemaName;
    }

    public RenameSemanticViewRequest setNewViewName(String newViewName) {
        this.newViewName = newViewName;
        return this;
    }
    public String getNewViewName() {
        return this.newViewName;
    }

    public RenameSemanticViewRequest setOldSchemaName(String oldSchemaName) {
        this.oldSchemaName = oldSchemaName;
        return this;
    }
    public String getOldSchemaName() {
        return this.oldSchemaName;
    }

    public RenameSemanticViewRequest setOldViewName(String oldViewName) {
        this.oldViewName = oldViewName;
        return this;
    }
    public String getOldViewName() {
        return this.oldViewName;
    }

}
