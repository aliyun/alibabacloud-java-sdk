// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateTableShrinkRequest extends TeaModel {
    /**
     * <p>The data catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The column definitions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;Primary key&quot;}]</p>
     */
    @NameInMap("Columns")
    public String columnsShrink;

    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>Test event table</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The data retention policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HotTTL&quot;:7,&quot;ColdTTL&quot;:30}</p>
     */
    @NameInMap("RetentionPolicy")
    public String retentionPolicyShrink;

    public static CreateTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableShrinkRequest self = new CreateTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableShrinkRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public CreateTableShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTableShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public CreateTableShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateTableShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateTableShrinkRequest setRetentionPolicyShrink(String retentionPolicyShrink) {
        this.retentionPolicyShrink = retentionPolicyShrink;
        return this;
    }
    public String getRetentionPolicyShrink() {
        return this.retentionPolicyShrink;
    }

}
