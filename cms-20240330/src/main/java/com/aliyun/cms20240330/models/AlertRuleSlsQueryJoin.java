// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleSlsQueryJoin extends TeaModel {
    /**
     * <p>连接条件列表</p>
     */
    @NameInMap("conditions")
    public java.util.List<AlertRuleSlsQueryJoinConditions> conditions;

    /**
     * <p>集合操作类型。</p>
     * <ul>
     * <li>CrossJoin： 笛卡尔积</li>
     * <li>FullJoin：全联</li>
     * <li>InnerJoin：内联</li>
     * <li>LeftExclude： 左斥</li>
     * <li>RightExclude：右斥</li>
     * <li>LeftJoin：左联</li>
     * <li>RightJoin：右联</li>
     * <li>NoJoin：不合并</li>
     * <li>Concat： 拼接</li>
     * </ul>
     * <p>参见：
     *   <a href="https://help.aliyun.com/zh/sls/user-guide/set-query-statistics-statement">https://help.aliyun.com/zh/sls/user-guide/set-query-statistics-statement</a></p>
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
         * <p>条件的左操作参数，格式为$<query_idx>.&lt;结果集字段名&gt;</p>
         * 
         * <strong>example:</strong>
         * <p>$0.<strong>topic</strong></p>
         */
        @NameInMap("firstField")
        public String firstField;

        /**
         * <p>比较操作符，取值范围：&lt;, &gt;, ==, !=, &lt;=, &gt;=</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>条件的右操作参数，格式为$<query_idx>.&lt;结果集字段名&gt;</p>
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
