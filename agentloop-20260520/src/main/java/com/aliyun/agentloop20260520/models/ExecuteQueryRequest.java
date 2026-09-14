// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ExecuteQueryRequest extends TeaModel {
    /**
     * <p>The annotation filter.</p>
     */
    @NameInMap("annotationFilter")
    public ExecuteQueryRequestAnnotationFilter annotationFilter;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1760925728</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("length")
    public Integer length;

    /**
     * <p>The maximum output length.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxOutputLength")
    public Integer maxOutputLength;

    /**
     * <p>The pagination offset.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1760925788</p>
     */
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

    /**
     * <p>The dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static ExecuteQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteQueryRequest self = new ExecuteQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteQueryRequest setAnnotationFilter(ExecuteQueryRequestAnnotationFilter annotationFilter) {
        this.annotationFilter = annotationFilter;
        return this;
    }
    public ExecuteQueryRequestAnnotationFilter getAnnotationFilter() {
        return this.annotationFilter;
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

    public static class ExecuteQueryRequestAnnotationFilterConditions extends TeaModel {
        /**
         * <p>The annotation key.</p>
         * 
         * <strong>example:</strong>
         * <p>answer_quality</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The annotation value.</p>
         * 
         * <strong>example:</strong>
         * <p>GOOD</p>
         */
        @NameInMap("value")
        public Object value;

        public static ExecuteQueryRequestAnnotationFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            ExecuteQueryRequestAnnotationFilterConditions self = new ExecuteQueryRequestAnnotationFilterConditions();
            return TeaModel.build(map, self);
        }

        public ExecuteQueryRequestAnnotationFilterConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecuteQueryRequestAnnotationFilterConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExecuteQueryRequestAnnotationFilterConditions setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ExecuteQueryRequestAnnotationFilter extends TeaModel {
        /**
         * <p>The annotation filter conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<ExecuteQueryRequestAnnotationFilterConditions> conditions;

        public static ExecuteQueryRequestAnnotationFilter build(java.util.Map<String, ?> map) throws Exception {
            ExecuteQueryRequestAnnotationFilter self = new ExecuteQueryRequestAnnotationFilter();
            return TeaModel.build(map, self);
        }

        public ExecuteQueryRequestAnnotationFilter setConditions(java.util.List<ExecuteQueryRequestAnnotationFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ExecuteQueryRequestAnnotationFilterConditions> getConditions() {
            return this.conditions;
        }

    }

}
