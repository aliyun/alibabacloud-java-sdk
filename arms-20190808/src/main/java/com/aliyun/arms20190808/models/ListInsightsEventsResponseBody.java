// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsResponseBody extends TeaModel {
    /**
     * <p>The description of the event.</p>
     */
    @NameInMap("InsightsEvents")
    public java.util.List<ListInsightsEventsResponseBodyInsightsEvents> insightsEvents;

    /**
     * <p>The title of the event.</p>
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
         */
        @NameInMap("Date")
        public Long date;

        /**
         * <p>The ID of the application associated with the event.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Queries the abnormal Insights events within a specified period of time.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>auditing</p>
         */
        @NameInMap("Pid")
        public String pid;

        @NameInMap("ProblemId")
        public String problemId;

        /**
         * <p>The overall response time of the \[HTTP] service of the application \[sd] spikes at \[2022-07-27 10:57:00]</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time at which the event occurred. The value is a timestamp.</p>
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
