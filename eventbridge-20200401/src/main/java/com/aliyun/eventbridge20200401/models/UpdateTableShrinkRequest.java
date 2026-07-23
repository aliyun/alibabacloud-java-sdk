// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateTableShrinkRequest extends TeaModel {
    /**
     * <p>Add column</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}</p>
     */
    @NameInMap("AddColumn")
    public String addColumnShrink;

    /**
     * <p>Data catalog to which it belongs</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Idempotency token</p>
     * 
     * <strong>example:</strong>
     * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Delete column</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;old_column&quot;}</p>
     */
    @NameInMap("DeleteColumn")
    public String deleteColumnShrink;

    /**
     * <p>Table name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Namespace to which it belongs</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Rename column</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;old_name&quot;,&quot;NewName&quot;:&quot;new_name&quot;}</p>
     */
    @NameInMap("RenameColumn")
    public String renameColumnShrink;

    /**
     * <p>Update column comment</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Comment&quot;:&quot;主键ID&quot;}</p>
     */
    @NameInMap("UpdateColumnComment")
    public String updateColumnCommentShrink;

    /**
     * <p>Update column type</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;}</p>
     */
    @NameInMap("UpdateColumnType")
    public String updateColumnTypeShrink;

    /**
     * <p>Update table comment</p>
     * 
     * <strong>example:</strong>
     * <p>更新后的备注</p>
     */
    @NameInMap("UpdateComment")
    public String updateComment;

    /**
     * <p>Update retention policy</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HotTTL&quot;:7,&quot;ColdTTL&quot;:30}</p>
     */
    @NameInMap("UpdateRetentionPolicy")
    public String updateRetentionPolicyShrink;

    public static UpdateTableShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableShrinkRequest self = new UpdateTableShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableShrinkRequest setAddColumnShrink(String addColumnShrink) {
        this.addColumnShrink = addColumnShrink;
        return this;
    }
    public String getAddColumnShrink() {
        return this.addColumnShrink;
    }

    public UpdateTableShrinkRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public UpdateTableShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTableShrinkRequest setDeleteColumnShrink(String deleteColumnShrink) {
        this.deleteColumnShrink = deleteColumnShrink;
        return this;
    }
    public String getDeleteColumnShrink() {
        return this.deleteColumnShrink;
    }

    public UpdateTableShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTableShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateTableShrinkRequest setRenameColumnShrink(String renameColumnShrink) {
        this.renameColumnShrink = renameColumnShrink;
        return this;
    }
    public String getRenameColumnShrink() {
        return this.renameColumnShrink;
    }

    public UpdateTableShrinkRequest setUpdateColumnCommentShrink(String updateColumnCommentShrink) {
        this.updateColumnCommentShrink = updateColumnCommentShrink;
        return this;
    }
    public String getUpdateColumnCommentShrink() {
        return this.updateColumnCommentShrink;
    }

    public UpdateTableShrinkRequest setUpdateColumnTypeShrink(String updateColumnTypeShrink) {
        this.updateColumnTypeShrink = updateColumnTypeShrink;
        return this;
    }
    public String getUpdateColumnTypeShrink() {
        return this.updateColumnTypeShrink;
    }

    public UpdateTableShrinkRequest setUpdateComment(String updateComment) {
        this.updateComment = updateComment;
        return this;
    }
    public String getUpdateComment() {
        return this.updateComment;
    }

    public UpdateTableShrinkRequest setUpdateRetentionPolicyShrink(String updateRetentionPolicyShrink) {
        this.updateRetentionPolicyShrink = updateRetentionPolicyShrink;
        return this;
    }
    public String getUpdateRetentionPolicyShrink() {
        return this.updateRetentionPolicyShrink;
    }

}
