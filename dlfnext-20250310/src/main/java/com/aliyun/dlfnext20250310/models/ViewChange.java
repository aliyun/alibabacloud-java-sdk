// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ViewChange extends TeaModel {
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

    public static ViewChange build(java.util.Map<String, ?> map) throws Exception {
        ViewChange self = new ViewChange();
        return TeaModel.build(map, self);
    }

    public ViewChange setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ViewChange setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ViewChange setDialect(String dialect) {
        this.dialect = dialect;
        return this;
    }
    public String getDialect() {
        return this.dialect;
    }

    public ViewChange setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ViewChange setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ViewChange setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
