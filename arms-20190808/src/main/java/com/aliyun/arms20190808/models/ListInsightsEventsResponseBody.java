// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsResponseBody extends TeaModel {
    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("InsightsEvents")
    public java.util.List<ListInsightsEventsResponseBodyInsightsEvents> insightsEvents;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6F1174DC-6085-5353-AAE7-D4ADCD******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInsightsEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInsightsEventsResponseBody self = new ListInsightsEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInsightsEventsResponseBody setInsightsEvents(java.util.List<ListInsightsEventsResponseBodyInsightsEvents> insightsEvents) {
        this.insightsEvents = insightsEvents;
        return this;
    }
    public java.util.List<ListInsightsEventsResponseBodyInsightsEvents> getInsightsEvents() {
        return this.insightsEvents;
    }

    public ListInsightsEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInsightsEventsResponseBodyInsightsEvents extends TeaModel {
        /**
         * <p>The time at which the event occurred. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1658890560</p>
         */
        @NameInMap("Date")
        public Long date;

        /**
         * <p>The description of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>The overall response time of the [HTTP] service of the application [sd] spikes at [2022-07-27 10:57:00]</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The severity of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>P3</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The ID of the application associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>dsv9zcel92@7da413b******</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>问题标识。</p>
         * 
         * <strong>example:</strong>
         * <p>erep3o9zue@01ebe697ab70566|@1499161100890550|@cn-hangzhou|@1701841800000|@1701842040000|@daa6c51a-3c44-4d57-9548-4e212c******</p>
         */
        @NameInMap("ProblemId")
        public String problemId;

        /**
         * <p>The title of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Average response-time spikes of application services</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>rtIncrease</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInsightsEventsResponseBodyInsightsEvents build(java.util.Map<String, ?> map) throws Exception {
            ListInsightsEventsResponseBodyInsightsEvents self = new ListInsightsEventsResponseBodyInsightsEvents();
            return TeaModel.build(map, self);
        }

        public ListInsightsEventsResponseBodyInsightsEvents setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public ListInsightsEventsResponseBodyInsightsEvents setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListInsightsEventsResponseBodyInsightsEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListInsightsEventsResponseBodyInsightsEvents setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListInsightsEventsResponseBodyInsightsEvents setProblemId(String problemId) {
            this.problemId = problemId;
            return this;
        }
        public String getProblemId() {
            return this.problemId;
        }

        public ListInsightsEventsResponseBodyInsightsEvents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListInsightsEventsResponseBodyInsightsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
