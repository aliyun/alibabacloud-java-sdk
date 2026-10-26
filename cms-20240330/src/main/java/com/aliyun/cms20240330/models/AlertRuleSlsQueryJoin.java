// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSlsQueryJoin extends TeaModel {
    /**
     * <p>The list of join conditions.</p>
     */
    @NameInMap("conditions")
    public java.util.List<AlertRuleSlsQueryJoinConditions> conditions;

    /**
     * <p>The set operation type. Valid values:</p>
     * <ul>
     * <li>CrossJoin: Cartesian product</li>
     * <li>FullJoin: full join</li>
     * <li>InnerJoin: inner join</li>
     * <li>LeftExclude: left exclude</li>
     * <li>RightExclude: right exclude</li>
     * <li>LeftJoin: left join</li>
     * <li>RightJoin: right join</li>
     * <li>NoJoin: no join</li>
     * <li>Concat: concatenation</li>
     * </ul>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/sls/user-guide/set-query-statistics-statement">https://www.alibabacloud.com/help/en/sls/user-guide/set-query-statistics-statement</a>.</p>
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
         * <p>The left operand of the condition, in the format of $<query_idx>.<result set field name>.</p>
         * 
         * <strong>example:</strong>
         * <p>$0.<strong>topic</strong></p>
         */
        @NameInMap("firstField")
        public String firstField;

        /**
         * <p>The comparison operator. Valid values: &lt;, &gt;, ==, !=, &lt;=, and &gt;=.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>The right operand of the condition, in the format of $<query_idx>.<result set field name>.</p>
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
