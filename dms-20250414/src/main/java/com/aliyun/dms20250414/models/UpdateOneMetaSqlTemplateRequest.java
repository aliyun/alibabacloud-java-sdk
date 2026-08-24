// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaSqlTemplateRequest extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("Expr")
    public String expr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    @NameInMap("SqlParams")
    public String sqlParams;

    @NameInMap("Tag")
    public String tag;

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
