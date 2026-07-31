// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSemanticViewRequest extends TeaModel {
    /**
     * <p>The ID of the ADB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the schema.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The name of the semantic view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_sv_name</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static DeleteSemanticViewRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSemanticViewRequest self = new DeleteSemanticViewRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSemanticViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteSemanticViewRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DeleteSemanticViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

}
