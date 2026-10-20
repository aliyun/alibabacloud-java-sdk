// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ViewChange extends TeaModel {
    /**
     * <p>The type of the view change operation.</p>
     * 
     * <strong>example:</strong>
     * <p>updateComment</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The view comment. Required when you perform the updateComment operation.</p>
     * 
     * <strong>example:</strong>
     * <p>View update description</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The dialect used in the view query statement. Required when you perform the addDialect, updateDialect, or dropDialect operation.</p>
     * 
     * <strong>example:</strong>
     * <p>flink</p>
     */
    @NameInMap("dialect")
    public String dialect;

    /**
     * <p>The key of the view property. Required when you perform the setOption or removeOption operation.</p>
     * 
     * <strong>example:</strong>
     * <p>view_option</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The view query statement. Required when you perform the addDialect or updateDialect operation.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT region, SUM(amount) AS total_amount FROM sales GROUP BY region</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The value of the view property. Required when you perform the setOption operation.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
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
