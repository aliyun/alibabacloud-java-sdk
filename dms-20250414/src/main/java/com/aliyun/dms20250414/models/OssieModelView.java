// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OssieModelView extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainTopic")
    public String domainTopic;

    @NameInMap("Expr")
    public String expr;

    @NameInMap("GmtCreated")
    public Long gmtCreated;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    @NameInMap("SemanticType")
    public String semanticType;

    @NameInMap("Source")
    public String source;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Title")
    public String title;

    @NameInMap("Version")
    public String version;

    public static OssieModelView build(java.util.Map<String, ?> map) throws Exception {
        OssieModelView self = new OssieModelView();
        return TeaModel.build(map, self);
    }

    public OssieModelView setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public OssieModelView setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public OssieModelView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OssieModelView setDomainTopic(String domainTopic) {
        this.domainTopic = domainTopic;
        return this;
    }
    public String getDomainTopic() {
        return this.domainTopic;
    }

    public OssieModelView setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public OssieModelView setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public OssieModelView setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public OssieModelView setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public OssieModelView setSemanticType(String semanticType) {
        this.semanticType = semanticType;
        return this;
    }
    public String getSemanticType() {
        return this.semanticType;
    }

    public OssieModelView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public OssieModelView setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public OssieModelView setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public OssieModelView setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public OssieModelView setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
