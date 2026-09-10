// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class FilterSetting extends TeaModel {
    /**
     * <p>The subscription conditions.</p>
     */
    @NameInMap("conditions")
    public java.util.List<FilterSettingConditions> conditions;

    /**
     * <p>Use either expression or relation. If expression is not empty, it takes precedence and relation is ignored. If expression is empty or not specified, relation (AND or OR) is used to perform a simple AND/OR operation on all conditions. Condition numbers correspond to the indexes of the conditions array (starting from 1). Each condition evaluates whether a single event field matches by using field (the event field path, which supports dot-notation nesting such as resource.tags.pod), op (the operator, such as CONTAIN, EQ, or IN), and value (the matching value).</p>
     * 
     * <strong>example:</strong>
     * <p>1 and 2 or 3</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>The logical relationship between conditions. This parameter takes effect when expression is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("relation")
    public String relation;

    public static FilterSetting build(java.util.Map<String, ?> map) throws Exception {
        FilterSetting self = new FilterSetting();
        return TeaModel.build(map, self);
    }

    public FilterSetting setConditions(java.util.List<FilterSettingConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<FilterSettingConditions> getConditions() {
        return this.conditions;
    }

    public FilterSetting setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public FilterSetting setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public static class FilterSettingConditions extends TeaModel {
        /**
         * <p>The JSON path of the event field. Dot-notation nesting is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>labels.alertname</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The comparison operator.</p>
         * 
         * <strong>example:</strong>
         * <p>EQ</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The matching value. Separate multiple values with commas when using IN or NOT_IN.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("value")
        public String value;

        public static FilterSettingConditions build(java.util.Map<String, ?> map) throws Exception {
            FilterSettingConditions self = new FilterSettingConditions();
            return TeaModel.build(map, self);
        }

        public FilterSettingConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public FilterSettingConditions setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public FilterSettingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
