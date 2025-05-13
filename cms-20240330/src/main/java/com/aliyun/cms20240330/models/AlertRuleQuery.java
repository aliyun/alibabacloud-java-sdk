// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleQuery extends TeaModel {
    @NameInMap("checkAfterDataComplete")
    public Boolean checkAfterDataComplete;

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

    public AlertRuleQuery setCheckAfterDataComplete(Boolean checkAfterDataComplete) {
        this.checkAfterDataComplete = checkAfterDataComplete;
        return this;
    }
    public Boolean getCheckAfterDataComplete() {
        return this.checkAfterDataComplete;
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

    public static class AlertRuleQueryQueriesApmFilters extends TeaModel {
        @NameInMap("dim")
        public String dim;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static AlertRuleQueryQueriesApmFilters build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryQueriesApmFilters self = new AlertRuleQueryQueriesApmFilters();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryQueriesApmFilters setDim(String dim) {
            this.dim = dim;
            return this;
        }
        public String getDim() {
            return this.dim;
        }

        public AlertRuleQueryQueriesApmFilters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AlertRuleQueryQueriesApmFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AlertRuleQueryQueries extends TeaModel {
        @NameInMap("apmAlertMetricId")
        public String apmAlertMetricId;

        @NameInMap("apmFilters")
        public java.util.List<AlertRuleQueryQueriesApmFilters> apmFilters;

        @NameInMap("apmGroupBy")
        public java.util.List<String> apmGroupBy;

        @NameInMap("duration")
        public Long duration;

        /**
         * <p>时间偏移结束时间(相对)，如果指定了start、end，则不指定window。</p>
         */
        @NameInMap("end")
        public Long end;

        /**
         * <p>查询表达式</p>
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
        public Long window;

        public static AlertRuleQueryQueries build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryQueries self = new AlertRuleQueryQueries();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryQueries setApmAlertMetricId(String apmAlertMetricId) {
            this.apmAlertMetricId = apmAlertMetricId;
            return this;
        }
        public String getApmAlertMetricId() {
            return this.apmAlertMetricId;
        }

        public AlertRuleQueryQueries setApmFilters(java.util.List<AlertRuleQueryQueriesApmFilters> apmFilters) {
            this.apmFilters = apmFilters;
            return this;
        }
        public java.util.List<AlertRuleQueryQueriesApmFilters> getApmFilters() {
            return this.apmFilters;
        }

        public AlertRuleQueryQueries setApmGroupBy(java.util.List<String> apmGroupBy) {
            this.apmGroupBy = apmGroupBy;
            return this;
        }
        public java.util.List<String> getApmGroupBy() {
            return this.apmGroupBy;
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

        public AlertRuleQueryQueries setWindow(Long window) {
            this.window = window;
            return this;
        }
        public Long getWindow() {
            return this.window;
        }

    }

}
