// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateOneMetaSqlTemplateRequest extends TeaModel {
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
     * <p>sales template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the SQL template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT SUM(amount) AS total_sales FROM store_daily_sales</p>
     */
    @NameInMap("Expr")
    public String expr;

    /**
     * <p>The knowledge source of the SQL template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_AGENT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The custom template parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;start_day_id&quot;: &quot;2026-08-01&quot;, &quot;end_day_id&quot;: &quot;2026-08-16&quot;}</p>
     */
    @NameInMap("SqlParams")
    public String sqlParams;

    /**
     * <p>The tag of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>sales</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The title of the SQL template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecommerce_sales</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateOneMetaSqlTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOneMetaSqlTemplateRequest self = new CreateOneMetaSqlTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateOneMetaSqlTemplateRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public CreateOneMetaSqlTemplateRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public CreateOneMetaSqlTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOneMetaSqlTemplateRequest setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public CreateOneMetaSqlTemplateRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOneMetaSqlTemplateRequest setSqlParams(String sqlParams) {
        this.sqlParams = sqlParams;
        return this;
    }
    public String getSqlParams() {
        return this.sqlParams;
    }

    public CreateOneMetaSqlTemplateRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateOneMetaSqlTemplateRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
