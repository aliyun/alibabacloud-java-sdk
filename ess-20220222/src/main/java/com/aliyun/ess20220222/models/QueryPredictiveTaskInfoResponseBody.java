// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfos")
    public QueryPredictiveTaskInfoResponseBodyTaskInfos taskInfos;

    public static QueryPredictiveTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveTaskInfoResponseBody self = new QueryPredictiveTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPredictiveTaskInfoResponseBody setTaskInfos(QueryPredictiveTaskInfoResponseBodyTaskInfos taskInfos) {
        this.taskInfos = taskInfos;
        return this;
    }
    public QueryPredictiveTaskInfoResponseBodyTaskInfos getTaskInfos() {
        return this.taskInfos;
    }

    public static class QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <strong>example:</strong>
         * <p>2025-12-17T10:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo self = new QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo();
            return TeaModel.build(map, self);
        }

        public QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryPredictiveTaskInfoResponseBodyTaskInfos extends TeaModel {
        @NameInMap("TaskInfo")
        public java.util.List<QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo> taskInfo;

        public static QueryPredictiveTaskInfoResponseBodyTaskInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryPredictiveTaskInfoResponseBodyTaskInfos self = new QueryPredictiveTaskInfoResponseBodyTaskInfos();
            return TeaModel.build(map, self);
        }

        public QueryPredictiveTaskInfoResponseBodyTaskInfos setTaskInfo(java.util.List<QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo> taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public java.util.List<QueryPredictiveTaskInfoResponseBodyTaskInfosTaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

    }

}
