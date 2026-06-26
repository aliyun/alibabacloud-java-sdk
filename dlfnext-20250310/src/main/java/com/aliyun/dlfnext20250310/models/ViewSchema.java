// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ViewSchema extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>Queries for different engines.</p>
     */
    @NameInMap("dialects")
    public java.util.Map<String, String> dialects;

    /**
     * <p>The list of field definitions for the view.</p>
     */
    @NameInMap("fields")
    public java.util.List<DataField> fields;

    /**
     * <p>The configuration parameters for the view.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>The default query for the view.</p>
     * 
     * <strong>example:</strong>
     * <p>select id from t1;</p>
     */
    @NameInMap("query")
    public String query;

    public static ViewSchema build(java.util.Map<String, ?> map) throws Exception {
        ViewSchema self = new ViewSchema();
        return TeaModel.build(map, self);
    }

    public ViewSchema setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ViewSchema setDialects(java.util.Map<String, String> dialects) {
        this.dialects = dialects;
        return this;
    }
    public java.util.Map<String, String> getDialects() {
        return this.dialects;
    }

    public ViewSchema setFields(java.util.List<DataField> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DataField> getFields() {
        return this.fields;
    }

    public ViewSchema setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public ViewSchema setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
