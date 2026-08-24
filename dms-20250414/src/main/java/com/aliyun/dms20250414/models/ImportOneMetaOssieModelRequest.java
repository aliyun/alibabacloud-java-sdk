// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ImportOneMetaOssieModelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocFormat")
    public String docFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Document")
    public String document;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String source;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Title")
    public String title;

    public static ImportOneMetaOssieModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportOneMetaOssieModelRequest self = new ImportOneMetaOssieModelRequest();
        return TeaModel.build(map, self);
    }

    public ImportOneMetaOssieModelRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public ImportOneMetaOssieModelRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public ImportOneMetaOssieModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportOneMetaOssieModelRequest setDocFormat(String docFormat) {
        this.docFormat = docFormat;
        return this;
    }
    public String getDocFormat() {
        return this.docFormat;
    }

    public ImportOneMetaOssieModelRequest setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public ImportOneMetaOssieModelRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ImportOneMetaOssieModelRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ImportOneMetaOssieModelRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
