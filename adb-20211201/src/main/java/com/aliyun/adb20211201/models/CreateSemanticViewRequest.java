// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSemanticViewRequest extends TeaModel {
    /**
     * <p>The ID of the ADB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp198m028ih55****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The YAML definition of the semantic view.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YAML content</p>
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
     * <p>adb_sv_name</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static CreateSemanticViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSemanticViewRequest self = new CreateSemanticViewRequest();
        return TeaModel.build(map, self);
    }

    public CreateSemanticViewRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSemanticViewRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateSemanticViewRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public CreateSemanticViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

}
