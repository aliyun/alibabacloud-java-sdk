// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ViewSchemaChange extends TeaModel {
    @NameInMap("action")
    public String action;

    /**
     * <p>required in UpdateComment</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>required in AddDialect/UpdateDialect/DropDialect</p>
     */
    @NameInMap("dialect")
    public String dialect;

    /**
     * <p>required in SetOption/RemoveOption</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>required in AddDialect/UpdateDialect</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>required in SetOption</p>
     */
    @NameInMap("value")
    public String value;

    public static ViewSchemaChange build(java.util.Map<String, ?> map) throws Exception {
        ViewSchemaChange self = new ViewSchemaChange();
        return TeaModel.build(map, self);
    }

    public ViewSchemaChange setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ViewSchemaChange setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ViewSchemaChange setDialect(String dialect) {
        this.dialect = dialect;
        return this;
    }
    public String getDialect() {
        return this.dialect;
    }

    public ViewSchemaChange setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ViewSchemaChange setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ViewSchemaChange setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
