// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaSqlTemplateView extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("Expr")
    public String expr;

    @NameInMap("GmtCreated")
    public Long gmtCreated;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    @NameInMap("Source")
    public String source;

    @NameInMap("SqlParams")
    public String sqlParams;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Title")
    public String title;

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
