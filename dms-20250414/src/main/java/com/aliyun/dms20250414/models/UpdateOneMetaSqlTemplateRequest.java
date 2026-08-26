// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaSqlTemplateRequest extends TeaModel {
    /**
     * <p>The UUID of the associated folder.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The UUID of the associated database.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The description of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>sales version 2</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>select count(1) from sales where dt = \&quot;2026-08-01\&quot;</p>
     */
    @NameInMap("Expr")
    public String expr;

    /**
     * <p>The UUID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86c5c290052147c***</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    /**
     * <p>The custom template parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dt&quot;: &quot;2026-08-01&quot;}</p>
     */
    @NameInMap("SqlParams")
    public String sqlParams;

    /**
     * <p>The tag of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>new_sales</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The title of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>sales_v2</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateOneMetaSqlTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOneMetaSqlTemplateRequest self = new UpdateOneMetaSqlTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOneMetaSqlTemplateRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public UpdateOneMetaSqlTemplateRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public UpdateOneMetaSqlTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOneMetaSqlTemplateRequest setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public UpdateOneMetaSqlTemplateRequest setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public UpdateOneMetaSqlTemplateRequest setSqlParams(String sqlParams) {
        this.sqlParams = sqlParams;
        return this;
    }
    public String getSqlParams() {
        return this.sqlParams;
    }

    public UpdateOneMetaSqlTemplateRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public UpdateOneMetaSqlTemplateRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
