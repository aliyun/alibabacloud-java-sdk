// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEventResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<DescribeServiceEventResponseBodyEvents> events;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPageNum")
    public Long totalPageNum;

    public static DescribeServiceEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEventResponseBody self = new DescribeServiceEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEventResponseBody setEvents(java.util.List<DescribeServiceEventResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeServiceEventResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeServiceEventResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeServiceEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceEventResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeServiceEventResponseBody setTotalPageNum(Long totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class DescribeServiceEventResponseBodyEvents extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        public static DescribeServiceEventResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceEventResponseBodyEvents self = new DescribeServiceEventResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeServiceEventResponseBodyEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServiceEventResponseBodyEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeServiceEventResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeServiceEventResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
