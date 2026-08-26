// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaOssieModelRequest extends TeaModel {
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
     * <p>The semantic description.</p>
     * 
     * <strong>example:</strong>
     * <p>Order summary</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The document type of the semantic model. Valid values:</p>
     * <ul>
     * <li>JSON</li>
     * <li>YAML</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("DocFormat")
    public String docFormat;

    /**
     * <p>The document definition of the semantic model.</p>
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
     * <p>The UUID of the knowledge.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86c5c290052147c***</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    /**
     * <p>The tag of the semantic model.</p>
     * 
     * <strong>example:</strong>
     * <p>sales</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The semantic title.</p>
     * 
     * <strong>example:</strong>
     * <p>Order total</p>
     */
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
