// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ExecuteQueryRequest extends TeaModel {
    @NameInMap("from")
    public Integer from;

    @NameInMap("length")
    public Integer length;

    @NameInMap("maxOutputLength")
    public Integer maxOutputLength;

    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The query entered by the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select count(*) from product_faq_dataset</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("to")
    public Integer to;

    /**
     * <p>The statement type. Currently, only SQL is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static ExecuteQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteQueryRequest self = new ExecuteQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteQueryRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public ExecuteQueryRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ExecuteQueryRequest setMaxOutputLength(Integer maxOutputLength) {
        this.maxOutputLength = maxOutputLength;
        return this;
    }
    public Integer getMaxOutputLength() {
        return this.maxOutputLength;
    }

    public ExecuteQueryRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ExecuteQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ExecuteQueryRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public ExecuteQueryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExecuteQueryRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
