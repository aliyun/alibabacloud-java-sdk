// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateTableRequest extends TeaModel {
    /**
     * <p>Add column</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}</p>
     */
    @NameInMap("AddColumn")
    public UpdateTableRequestAddColumn addColumn;

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
    public UpdateTableRequestDeleteColumn deleteColumn;

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
    public UpdateTableRequestRenameColumn renameColumn;

    /**
     * <p>Update column comment</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Comment&quot;:&quot;主键ID&quot;}</p>
     */
    @NameInMap("UpdateColumnComment")
    public UpdateTableRequestUpdateColumnComment updateColumnComment;

    /**
     * <p>Update column type</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;}</p>
     */
    @NameInMap("UpdateColumnType")
    public UpdateTableRequestUpdateColumnType updateColumnType;

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
        /**
         * <p>Comment.</p>
         * 
         * <strong>example:</strong>
         * <p>接口授权_刘宏月_申请测试环境服务器资源访问权限_2026-07-06</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The full name of the queried event type.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The event target type. For more information, see <a href="https://help.aliyun.com/document_detail/185887.html">Event target parameters</a>.</p>
         * 
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
         * <p>Connector name.</p>
         * 
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
         * <p>Connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The updated name. Enter this when you need to modify the metric name.</p>
         * 
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
        /**
         * <p>Comment information.</p>
         * 
         * <strong>example:</strong>
         * <p>DIUS Dev 环境</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Extended data name</p>
         * 
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
         * <p>Connector name</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Column type</p>
         * 
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
         * <p>Cold storage duration</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("ColdTTL")
        public Integer coldTTL;

        /**
         * <p>Hot storage duration</p>
         * 
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
