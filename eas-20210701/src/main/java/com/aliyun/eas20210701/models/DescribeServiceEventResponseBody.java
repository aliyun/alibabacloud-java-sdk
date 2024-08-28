// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEventResponseBody extends TeaModel {
    /**
     * <p>The events.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeServiceEventResponseBodyEvents> events;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D491C94-6239-5318-B4B4-799D859***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
        /**
         * <p>The returned message. The message is formatted and returned in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;versionId\&quot;:1,\&quot;message\&quot;:\&quot;Stage scale complete\&quot;,\&quot;availableInstance\&quot;:1,\&quot;unavailableInstance\&quot;:0}</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the event. The information about the change in the service status is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Updating</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The time when the event occurred. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-09 06:30:00</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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
