// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSlsQueryJoin extends TeaModel {
    /**
     * <p>List of connection conditions.</p>
     */
    @NameInMap("conditions")
    public java.util.List<AlertRuleSlsQueryJoinConditions> conditions;

    /**
     * <p>Set operation type.
     * CrossJoin: Cartesian product
     * FullJoin: Full outer join
     * InnerJoin: Inner join
     * LeftExclude: Left anti join
     * RightExclude: Right anti join
     * LeftJoin: Left outer join
     * RightJoin: Right outer join
     * NoJoin: No merge
     * Concat: Concatenation</p>
     * <p>See also: <a href="https://help.aliyun.com/zh/sls/user-guide/set-query-statistics-statement">https://help.aliyun.com/zh/sls/user-guide/set-query-statistics-statement</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CrossJoin</p>
     */
    @NameInMap("type")
    public String type;

    public static AlertRuleSlsQueryJoin build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleSlsQueryJoin self = new AlertRuleSlsQueryJoin();
        return TeaModel.build(map, self);
    }

    public AlertRuleSlsQueryJoin setConditions(java.util.List<AlertRuleSlsQueryJoinConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<AlertRuleSlsQueryJoinConditions> getConditions() {
        return this.conditions;
    }

    public AlertRuleSlsQueryJoin setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AlertRuleSlsQueryJoinConditions extends TeaModel {
        /**
         * <p>Left-hand operand of the condition, formatted as $<query_idx>.<result_set_field_name>.</p>
         * 
         * <strong>example:</strong>
         * <p>$0.<strong>topic</strong></p>
         */
        @NameInMap("firstField")
        public String firstField;

        /**
         * <p>Comparison operator; valid values: &lt;, &gt;, ==, !=, &lt;=, &gt;=.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>Right-hand operand of the condition, formatted as $<query_idx>.<result_set_field_name>.</p>
         * 
         * <strong>example:</strong>
         * <p>$0.<strong>topic</strong></p>
         */
        @NameInMap("secondField")
        public String secondField;

        public static AlertRuleSlsQueryJoinConditions build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleSlsQueryJoinConditions self = new AlertRuleSlsQueryJoinConditions();
            return TeaModel.build(map, self);
        }

        public AlertRuleSlsQueryJoinConditions setFirstField(String firstField) {
            this.firstField = firstField;
            return this;
        }
        public String getFirstField() {
            return this.firstField;
        }

        public AlertRuleSlsQueryJoinConditions setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public AlertRuleSlsQueryJoinConditions setSecondField(String secondField) {
            this.secondField = secondField;
            return this;
        }
        public String getSecondField() {
            return this.secondField;
        }

    }

}
