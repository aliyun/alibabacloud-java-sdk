// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaOssieModelRequest extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    @NameInMap("DocFormat")
    public String docFormat;

    @NameInMap("Document")
    public String document;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Title")
    public String title;

    public static UpdateOneMetaOssieModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOneMetaOssieModelRequest self = new UpdateOneMetaOssieModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOneMetaOssieModelRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public UpdateOneMetaOssieModelRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public UpdateOneMetaOssieModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOneMetaOssieModelRequest setDocFormat(String docFormat) {
        this.docFormat = docFormat;
        return this;
    }
    public String getDocFormat() {
        return this.docFormat;
    }

    public UpdateOneMetaOssieModelRequest setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public UpdateOneMetaOssieModelRequest setKnowledgeUuid(String knowledgeUuid) {
        this.knowledgeUuid = knowledgeUuid;
        return this;
    }
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public UpdateOneMetaOssieModelRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public UpdateOneMetaOssieModelRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
