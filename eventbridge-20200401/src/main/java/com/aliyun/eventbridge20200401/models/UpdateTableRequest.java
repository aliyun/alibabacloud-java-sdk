// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateTableRequest extends TeaModel {
    /**
     * <p>新增列定义（JSON 对象）。包含 Name（列名，必填）、Type（数据类型，必填，如 STRING、INT32、INT64、FLOAT、DOUBLE、BOOLEAN、TIMESTAMP）、Comment（列备注，选填）。每次调用只能新增一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}</p>
     */
    @NameInMap("AddColumn")
    public UpdateTableRequestAddColumn addColumn;

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
    public UpdateTableRequestDeleteColumn deleteColumn;

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
    public UpdateTableRequestRenameColumn renameColumn;

    /**
     * <p>修改列的备注信息（JSON 对象）。包含 Name（目标列名，必填）、Comment（新备注内容，必填，传空字符串可清除备注）。每次调用只能修改一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Comment&quot;:&quot;主键ID&quot;}</p>
     */
    @NameInMap("UpdateColumnComment")
    public UpdateTableRequestUpdateColumnComment updateColumnComment;

    /**
     * <p>修改列的数据类型（JSON 对象）。包含 Name（目标列名，必填）、Type（新数据类型，必填）。仅支持兼容类型转换，每次调用只能修改一列</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;}</p>
     */
    @NameInMap("UpdateColumnType")
    public UpdateTableRequestUpdateColumnType updateColumnType;

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
    public UpdateTableRequestUpdateRetentionPolicy updateRetentionPolicy;

    public static UpdateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableRequest self = new UpdateTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableRequest setAddColumn(UpdateTableRequestAddColumn addColumn) {
        this.addColumn = addColumn;
        return this;
    }
    public UpdateTableRequestAddColumn getAddColumn() {
        return this.addColumn;
    }

    public UpdateTableRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public UpdateTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTableRequest setDeleteColumn(UpdateTableRequestDeleteColumn deleteColumn) {
        this.deleteColumn = deleteColumn;
        return this;
    }
    public UpdateTableRequestDeleteColumn getDeleteColumn() {
        return this.deleteColumn;
    }

    public UpdateTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTableRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateTableRequest setRenameColumn(UpdateTableRequestRenameColumn renameColumn) {
        this.renameColumn = renameColumn;
        return this;
    }
    public UpdateTableRequestRenameColumn getRenameColumn() {
        return this.renameColumn;
    }

    public UpdateTableRequest setUpdateColumnComment(UpdateTableRequestUpdateColumnComment updateColumnComment) {
        this.updateColumnComment = updateColumnComment;
        return this;
    }
    public UpdateTableRequestUpdateColumnComment getUpdateColumnComment() {
        return this.updateColumnComment;
    }

    public UpdateTableRequest setUpdateColumnType(UpdateTableRequestUpdateColumnType updateColumnType) {
        this.updateColumnType = updateColumnType;
        return this;
    }
    public UpdateTableRequestUpdateColumnType getUpdateColumnType() {
        return this.updateColumnType;
    }

    public UpdateTableRequest setUpdateComment(String updateComment) {
        this.updateComment = updateComment;
        return this;
    }
    public String getUpdateComment() {
        return this.updateComment;
    }

    public UpdateTableRequest setUpdateRetentionPolicy(UpdateTableRequestUpdateRetentionPolicy updateRetentionPolicy) {
        this.updateRetentionPolicy = updateRetentionPolicy;
        return this;
    }
    public UpdateTableRequestUpdateRetentionPolicy getUpdateRetentionPolicy() {
        return this.updateRetentionPolicy;
    }

    public static class UpdateTableRequestAddColumn extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTableRequestAddColumn build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestAddColumn self = new UpdateTableRequestAddColumn();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestAddColumn setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateTableRequestAddColumn setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTableRequestAddColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateTableRequestDeleteColumn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTableRequestDeleteColumn build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestDeleteColumn self = new UpdateTableRequestDeleteColumn();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestDeleteColumn setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTableRequestRenameColumn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>fvt-oos-application-group-56ca74b000</p>
         */
        @NameInMap("NewName")
        public String newName;

        public static UpdateTableRequestRenameColumn build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestRenameColumn self = new UpdateTableRequestRenameColumn();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestRenameColumn setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTableRequestRenameColumn setNewName(String newName) {
            this.newName = newName;
            return this;
        }
        public String getNewName() {
            return this.newName;
        }

    }

    public static class UpdateTableRequestUpdateColumnComment extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTableRequestUpdateColumnComment build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestUpdateColumnComment self = new UpdateTableRequestUpdateColumnComment();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestUpdateColumnComment setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateTableRequestUpdateColumnComment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTableRequestUpdateColumnType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTableRequestUpdateColumnType build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestUpdateColumnType self = new UpdateTableRequestUpdateColumnType();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestUpdateColumnType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTableRequestUpdateColumnType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateTableRequestUpdateRetentionPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("ColdTTL")
        public Integer coldTTL;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("HotTTL")
        public Integer hotTTL;

        public static UpdateTableRequestUpdateRetentionPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableRequestUpdateRetentionPolicy self = new UpdateTableRequestUpdateRetentionPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateTableRequestUpdateRetentionPolicy setColdTTL(Integer coldTTL) {
            this.coldTTL = coldTTL;
            return this;
        }
        public Integer getColdTTL() {
            return this.coldTTL;
        }

        public UpdateTableRequestUpdateRetentionPolicy setHotTTL(Integer hotTTL) {
            this.hotTTL = hotTTL;
            return this;
        }
        public Integer getHotTTL() {
            return this.hotTTL;
        }

    }

}
