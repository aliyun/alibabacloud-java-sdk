// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaSqlTemplateView extends TeaModel {
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
     * <p>sales count</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The content of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT store_name, daily_sales FROM store_daily_sales ORDER BY daily_sales DESC LIMIT 5</p>
     */
    @NameInMap("Expr")
    public String expr;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1787302285000</p>
     */
    @NameInMap("GmtCreated")
    public Long gmtCreated;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1787302285000</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    /**
     * <p>The UUID of the knowledge.</p>
     * 
     * <strong>example:</strong>
     * <p>86c5c290052147c***</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    /**
     * <p>The source of the SQL template knowledge.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_AGENT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The parameters of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dt&quot;: &quot;2026-08-01&quot;}</p>
     */
    @NameInMap("SqlParams")
    public String sqlParams;

    /**
     * <p>The summary of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>sales summary</p>
     */
    @NameInMap("Summary")
    public String summary;

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
     * <p>ecommerce_sales</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The version of the SQL template.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("Version")
    public String version;

    public static OneMetaSqlTemplateView build(java.util.Map<String, ?> map) throws Exception {
        OneMetaSqlTemplateView self = new OneMetaSqlTemplateView();
        return TeaModel.build(map, self);
    }

    public OneMetaSqlTemplateView setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public OneMetaSqlTemplateView setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public OneMetaSqlTemplateView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OneMetaSqlTemplateView setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public OneMetaSqlTemplateView setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public OneMetaSqlTemplateView setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public OneMetaSqlTemplateView setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public OneMetaSqlTemplateView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public OneMetaSqlTemplateView setSqlParams(String sqlParams) {
        this.sqlParams = sqlParams;
        return this;
    }
    public String getSqlParams() {
        return this.sqlParams;
    }

    public OneMetaSqlTemplateView setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public OneMetaSqlTemplateView setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public OneMetaSqlTemplateView setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public OneMetaSqlTemplateView setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
