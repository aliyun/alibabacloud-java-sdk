// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OssieModelView extends TeaModel {
    /**
     * <p>The UUID of the associated instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-SH-cd3ns***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The UUID of the associated database.</p>
     * 
     * <strong>example:</strong>
     * <p>md-SH-q8XzcK***</p>
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
     * <p>The semantic document format type.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("DocFormat")
    public String docFormat;

    /**
     * <p>The domain topic.</p>
     * 
     * <strong>example:</strong>
     * <p>Order</p>
     */
    @NameInMap("DomainTopic")
    public String domainTopic;

    /**
     * <p>The expression content.</p>
     * 
     * <strong>example:</strong>
     * <p>select 1</p>
     */
    @NameInMap("Expr")
    public String expr;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1663809374000</p>
     */
    @NameInMap("GmtCreated")
    public Long gmtCreated;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1780539699000</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    /**
     * <p>The UUID of the semantic knowledge.</p>
     * 
     * <strong>example:</strong>
     * <p>dfb58bd***</p>
     */
    @NameInMap("KnowledgeUuid")
    public String knowledgeUuid;

    /**
     * <p>The semantic document content.</p>
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
    @NameInMap("RawDoc")
    public String rawDoc;

    /**
     * <p>The semantic type.</p>
     * 
     * <strong>example:</strong>
     * <p>Ossie</p>
     */
    @NameInMap("SemanticType")
    public String semanticType;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_EDIT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The document summary.</p>
     * 
     * <strong>example:</strong>
     * <p>knowledge summary</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The knowledge base tag.</p>
     * 
     * <strong>example:</strong>
     * <p>1dq7qod8hxtt1***</p>
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

    /**
     * <p>The version information.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
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

    public OssieModelView setDocFormat(String docFormat) {
        this.docFormat = docFormat;
        return this;
    }
    public String getDocFormat() {
        return this.docFormat;
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

    public OssieModelView setRawDoc(String rawDoc) {
        this.rawDoc = rawDoc;
        return this;
    }
    public String getRawDoc() {
        return this.rawDoc;
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
