// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FullSchemaChange extends TeaModel {
    /**
     * <p>The type of change.</p>
     * 
     * <strong>example:</strong>
     * <p>setOption</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The description. This parameter is required when <code>action</code> is <code>UpdateComment</code> or <code>AddColumn</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>col_comment</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The column type. This parameter is required when <code>action</code> is <code>AddColumn</code>.</p>
     */
    @NameInMap("dataType")
    public FullDataType dataType;

    /**
     * <p>The table column names. This parameter is required when <code>action</code> is <code>AddColumn</code>, <code>RenameColumn</code>, <code>DropColumn</code>, <code>UpdateColumnComment</code>, <code>UpdateColumnType</code>, or <code>UpdateColumnNullability</code>.</p>
     */
    @NameInMap("fieldNames")
    public java.util.List<String> fieldNames;

    /**
     * <p>Specifies whether the column is nullable. This parameter is required when the <code>action</code> is <code>UpdateColumnType</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keepNullability")
    public Boolean keepNullability;

    /**
     * <p>The key for the configuration. This parameter is required when <code>action</code> is <code>SetOption</code> or <code>RemoveOption</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;true\&quot;</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The column to move. This parameter is required when <code>action</code> is <code>AddColumn</code> or <code>UpdateColumnPosition</code>.</p>
     */
    @NameInMap("move")
    public Move move;

    /**
     * <p>The new description for the column. This parameter is required when <code>action</code> is <code>UpdateColumnComment</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>col_comment_test</p>
     */
    @NameInMap("newComment")
    public String newComment;

    /**
     * <p>The new column type. This parameter is required when <code>action</code> is <code>UpdateColumnType</code>.</p>
     */
    @NameInMap("newDataType")
    public FullDataType newDataType;

    /**
     * <p>The new name of the column. This parameter is required when <code>action</code> is <code>RenameColumn</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>new_col_test</p>
     */
    @NameInMap("newName")
    public String newName;

    /**
     * <p>Specifies whether the new column is nullable. This parameter is required when <code>action</code> is <code>UpdateColumnType</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newNullability")
    public Boolean newNullability;

    /**
     * <p>The value of the configuration. This parameter is required when <code>action</code> is <code>SetOption</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;manifest.delete-file-drop-stats\&quot;</p>
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
