// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsResponseBody extends TeaModel {
    @NameInMap("InsightsEvents")
    public java.util.List<ListInsightsEventsResponseBodyInsightsEvents> insightsEvents;

    // 请求ID
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
        @NameInMap("Date")
        public Long date;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Level")
        public String level;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Title")
        public String title;

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
