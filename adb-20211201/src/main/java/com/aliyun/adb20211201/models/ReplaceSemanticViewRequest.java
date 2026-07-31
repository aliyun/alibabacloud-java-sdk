// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReplaceSemanticViewRequest extends TeaModel {
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
     * <p>The definition of the semantic view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YAML 内容</p>
     */
    @NameInMap("Definition")
    public String definition;

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
     * <p>sales_sv</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static ReplaceSemanticViewRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSemanticViewRequest self = new ReplaceSemanticViewRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceSemanticViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ReplaceSemanticViewRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public ReplaceSemanticViewRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ReplaceSemanticViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

}
