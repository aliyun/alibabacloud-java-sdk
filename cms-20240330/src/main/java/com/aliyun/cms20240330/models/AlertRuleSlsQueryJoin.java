// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSlsQueryJoin extends TeaModel {
    @NameInMap("conditions")
    public java.util.List<AlertRuleSlsQueryJoinConditions> conditions;

    /**
     * <p>集合操作类型。
     *   ● CrossJoin： 笛卡尔积
     *   ● FullJoin：全联
     *   ● InnerJoin：内联
     *   ● LeftExclude： 左斥
     *   ● RightExclude：右斥
     *   ● LeftJoin：左联
     *   ● RightJoin：右联
     *   ● NoJoin：不合并
     *   ● Concat： 拼接
     *   <a href="https://help.aliyun.com/zh/sls/user-guide/set-query-statistics-statement">https://help.aliyun.com/zh/sls/user-guide/set-query-statistics-statement</a></p>
     * <p>This parameter is required.</p>
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
         * <p>条件的左操作参数，格式为$<query_idx>.&lt;结果集字段名&gt;</p>
         */
        @NameInMap("firstField")
        public String firstField;

        /**
         * <p>&lt;, &gt;, ==, !=, &lt;=, &gt;=</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>条件的右操作参数，格式为$<query_idx>.&lt;结果集字段名&gt;</p>
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
