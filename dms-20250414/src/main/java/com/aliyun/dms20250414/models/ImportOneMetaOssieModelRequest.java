// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ImportOneMetaOssieModelRequest extends TeaModel {
    /**
     * <p>The UUID of the associated folder.</p>
     * <p>This parameter is required.</p>
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
     * <p>The semantic description.</p>
     * 
     * <strong>example:</strong>
     * <p>Order summary</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The semantic model document type. Valid values: JSON and YAML.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("DocFormat")
    public String docFormat;

    /**
     * <p>The semantic model document definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;version&quot;: &quot;0.2.0.dev0&quot;,
     *   &quot;semantic_model&quot;: [
     *     {
     *       &quot;name&quot;: &quot;sales&quot;,
     *       &quot;datasets&quot;: [
     *         {
     *           &quot;name&quot;: &quot;orders&quot;,
     *           &quot;source&quot;: &quot;analytics.public.orders&quot;
     *         }
     *       ]
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("Document")
    public String document;

    /**
     * <p>The source of the semantic model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_AGENT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The semantic model tag.</p>
     * 
     * <strong>example:</strong>
     * <p>new_sales</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The semantic title. If the value is empty, the title is extracted from the document.</p>
     * 
     * <strong>example:</strong>
     * <p>Order total</p>
     */
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
