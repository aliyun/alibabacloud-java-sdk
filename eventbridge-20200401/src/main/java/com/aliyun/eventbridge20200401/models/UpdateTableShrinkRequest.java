// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateTableShrinkRequest extends TeaModel {
    /**
     * <p>新增列定义（JSON 对象）。包含 Name（列名，必填）、Type（数据类型，必填，如 STRING、INT32、INT64、FLOAT、DOUBLE、BOOLEAN、TIMESTAMP）、Comment（列备注，选填）。每次调用只能新增一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}</p>
     */
    @NameInMap("AddColumn")
    public String addColumnShrink;

    /**
     * <p>表所属的数据目录名称。可通过 ListCatalogs 获取</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>用于保证请求幂等性的Token。建议使用 UUID</p>
     * 
     * <strong>example:</strong>
     * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>删除列定义（JSON 对象）。包含 Name（要删除的列名，必填）。删除后不可恢复，已有数据中该列的值将丢失。每次调用只能删除一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;old_column&quot;}</p>
     */
    @NameInMap("DeleteColumn")
    public String deleteColumnShrink;

    /**
     * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>表所属的命名空间名称。可通过 ListNamespaces 获取</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>重命名列（JSON 对象）。包含 Name（原列名，必填）、NewName（新列名，必填）。每次调用只能重命名一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;old_name&quot;,&quot;NewName&quot;:&quot;new_name&quot;}</p>
     */
    @NameInMap("RenameColumn")
    public String renameColumnShrink;

    /**
     * <p>修改列的备注信息（JSON 对象）。包含 Name（目标列名，必填）、Comment（新备注内容，必填，传空字符串可清除备注）。每次调用只能修改一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Comment&quot;:&quot;主键ID&quot;}</p>
     */
    @NameInMap("UpdateColumnComment")
    public String updateColumnCommentShrink;

    /**
     * <p>修改列的数据类型（JSON 对象）。包含 Name（目标列名，必填）、Type（新数据类型，必填）。仅支持兼容类型转换，每次调用只能修改一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;}</p>
     */
    @NameInMap("UpdateColumnType")
    public String updateColumnTypeShrink;

    /**
     * <p>修改表的备注描述。传入新的备注内容替换原有备注，传空字符串可清除备注</p>
     * 
     * <strong>example:</strong>
     * <p>更新后的备注</p>
     */
    @NameInMap("UpdateComment")
    public String updateComment;

    /**
     * <p>修改数据保留策略（JSON 对象）。包含 HotTTL（热数据保留天数）、ColdTTL（冷数据保留天数）。传入后会替换原有策略</p>
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
