// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FullSchemaChange extends TeaModel {
    @NameInMap("action")
    public String action;

    /**
     * <p>required in UpdateComment/AddColumn</p>
     */
    @NameInMap("comment")
    public String comment;

    @NameInMap("dataType")
    public FullDataType dataType;

    /**
     * <p>required in AddColumn/RenameColumn/DropColumn/UpdateColumnComment/UpdateColumnType/UpdateColumnNullability</p>
     */
    @NameInMap("fieldNames")
    public java.util.List<String> fieldNames;

    /**
     * <p>required in UpdateColumnType</p>
     */
    @NameInMap("keepNullability")
    public Boolean keepNullability;

    /**
     * <p>required in SetOption/RemoveOption</p>
     */
    @NameInMap("key")
    public String key;

    @NameInMap("move")
    public Move move;

    /**
     * <p>required in UpdateColumnComment</p>
     */
    @NameInMap("newComment")
    public String newComment;

    @NameInMap("newDataType")
    public FullDataType newDataType;

    /**
     * <p>required in RenameColumn</p>
     */
    @NameInMap("newName")
    public String newName;

    /**
     * <p>required in UpdateColumnNullability</p>
     */
    @NameInMap("newNullability")
    public Boolean newNullability;

    /**
     * <p>required in SetOption</p>
     */
    @NameInMap("value")
    public String value;

    public static FullSchemaChange build(java.util.Map<String, ?> map) throws Exception {
        FullSchemaChange self = new FullSchemaChange();
        return TeaModel.build(map, self);
    }

    public FullSchemaChange setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public FullSchemaChange setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FullSchemaChange setDataType(FullDataType dataType) {
        this.dataType = dataType;
        return this;
    }
    public FullDataType getDataType() {
        return this.dataType;
    }

    public FullSchemaChange setFieldNames(java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }
    public java.util.List<String> getFieldNames() {
        return this.fieldNames;
    }

    public FullSchemaChange setKeepNullability(Boolean keepNullability) {
        this.keepNullability = keepNullability;
        return this;
    }
    public Boolean getKeepNullability() {
        return this.keepNullability;
    }

    public FullSchemaChange setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public FullSchemaChange setMove(Move move) {
        this.move = move;
        return this;
    }
    public Move getMove() {
        return this.move;
    }

    public FullSchemaChange setNewComment(String newComment) {
        this.newComment = newComment;
        return this;
    }
    public String getNewComment() {
        return this.newComment;
    }

    public FullSchemaChange setNewDataType(FullDataType newDataType) {
        this.newDataType = newDataType;
        return this;
    }
    public FullDataType getNewDataType() {
        return this.newDataType;
    }

    public FullSchemaChange setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public FullSchemaChange setNewNullability(Boolean newNullability) {
        this.newNullability = newNullability;
        return this;
    }
    public Boolean getNewNullability() {
        return this.newNullability;
    }

    public FullSchemaChange setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
