// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleQuery extends TeaModel {
    @NameInMap("duration")
    public Long duration;

    @NameInMap("expr")
    public String expr;

    @NameInMap("firstJoin")
    public AlertRuleSlsQueryJoin firstJoin;

    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    @NameInMap("groupType")
    public String groupType;

    @NameInMap("queries")
    public java.util.List<AlertRuleQueryQueries> queries;

    @NameInMap("secondJoin")
    public AlertRuleSlsQueryJoin secondJoin;

    /**
     * <p>查询类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static AlertRuleQuery build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleQuery self = new AlertRuleQuery();
        return TeaModel.build(map, self);
    }

    public AlertRuleQuery setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public AlertRuleQuery setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public AlertRuleQuery setFirstJoin(AlertRuleSlsQueryJoin firstJoin) {
        this.firstJoin = firstJoin;
        return this;
    }
    public AlertRuleSlsQueryJoin getFirstJoin() {
        return this.firstJoin;
    }

    public AlertRuleQuery setGroupFieldList(java.util.List<String> groupFieldList) {
        this.groupFieldList = groupFieldList;
        return this;
    }
    public java.util.List<String> getGroupFieldList() {
        return this.groupFieldList;
    }

    public AlertRuleQuery setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public AlertRuleQuery setQueries(java.util.List<AlertRuleQueryQueries> queries) {
        this.queries = queries;
        return this;
    }
    public java.util.List<AlertRuleQueryQueries> getQueries() {
        return this.queries;
    }

    public AlertRuleQuery setSecondJoin(AlertRuleSlsQueryJoin secondJoin) {
        this.secondJoin = secondJoin;
        return this;
    }
    public AlertRuleSlsQueryJoin getSecondJoin() {
        return this.secondJoin;
    }

    public AlertRuleQuery setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AlertRuleQueryQueries extends TeaModel {
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>时间偏移结束时间(相对)，如果指定了start、end，则不指定window。</p>
         */
        @NameInMap("end")
        public Long end;

        /**
         * <p>查询表达式</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>sls查询的时间偏移开始时间(相对)，如果指定了start、end，则不指定window。  例如：start=15， timeUnit=minute，表示15分钟前</p>
         */
        @NameInMap("start")
        public Long start;

        /**
         * <p>start和end、window的时间单位： day/hour/minute/second</p>
         */
        @NameInMap("timeUnit")
        public String timeUnit;

        /**
         * <p>整点时间查询区间。  如果指定了window则不指定start、end</p>
         */
        @NameInMap("window")
        public String window;

        public static AlertRuleQueryQueries build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryQueries self = new AlertRuleQueryQueries();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryQueries setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public AlertRuleQueryQueries setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public AlertRuleQueryQueries setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public AlertRuleQueryQueries setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public AlertRuleQueryQueries setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public AlertRuleQueryQueries setWindow(String window) {
            this.window = window;
            return this;
        }
        public String getWindow() {
            return this.window;
        }

    }

}
