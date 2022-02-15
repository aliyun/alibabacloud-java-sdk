// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListTrendForSourceEventResponseBody extends TeaModel {
    // 统计列表
    @NameInMap("data")
    public java.util.List<ListTrendForSourceEventResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListTrendForSourceEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrendForSourceEventResponseBody self = new ListTrendForSourceEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrendForSourceEventResponseBody setData(java.util.List<ListTrendForSourceEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTrendForSourceEventResponseBodyData> getData() {
        return this.data;
    }

    public ListTrendForSourceEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTrendForSourceEventResponseBodyData extends TeaModel {
        // 收敛率
        @NameInMap("convergenceRate")
        public String convergenceRate;

        // 最大持续时长
        @NameInMap("maxSustainTime")
        public Long maxSustainTime;

        // 是否跨天
        @NameInMap("skipDay")
        public Boolean skipDay;

        // 按监控源分组统计数据
        @NameInMap("sourceEventsStatMap")
        public java.util.Map<String, ?> sourceEventsStatMap;

        // 时间单位
        @NameInMap("unit")
        public String unit;

        public static ListTrendForSourceEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTrendForSourceEventResponseBodyData self = new ListTrendForSourceEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTrendForSourceEventResponseBodyData setConvergenceRate(String convergenceRate) {
            this.convergenceRate = convergenceRate;
            return this;
        }
        public String getConvergenceRate() {
            return this.convergenceRate;
        }

        public ListTrendForSourceEventResponseBodyData setMaxSustainTime(Long maxSustainTime) {
            this.maxSustainTime = maxSustainTime;
            return this;
        }
        public Long getMaxSustainTime() {
            return this.maxSustainTime;
        }

        public ListTrendForSourceEventResponseBodyData setSkipDay(Boolean skipDay) {
            this.skipDay = skipDay;
            return this;
        }
        public Boolean getSkipDay() {
            return this.skipDay;
        }

        public ListTrendForSourceEventResponseBodyData setSourceEventsStatMap(java.util.Map<String, ?> sourceEventsStatMap) {
            this.sourceEventsStatMap = sourceEventsStatMap;
            return this;
        }
        public java.util.Map<String, ?> getSourceEventsStatMap() {
            return this.sourceEventsStatMap;
        }

        public ListTrendForSourceEventResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
