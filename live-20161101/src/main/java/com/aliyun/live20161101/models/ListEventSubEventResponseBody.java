// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEventSubEventResponseBody extends TeaModel {
    /**
     * <p>The total number of callback records returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The callback records.</p>
     */
    @NameInMap("Logs")
    public java.util.List<ListEventSubEventResponseBodyLogs> logs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC8CB656-A7BA-1811-9D6B-4CC187E988BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEventSubEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventSubEventResponseBody self = new ListEventSubEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventSubEventResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListEventSubEventResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListEventSubEventResponseBody setLogs(java.util.List<ListEventSubEventResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListEventSubEventResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListEventSubEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEventSubEventResponseBodyLogs extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9qb1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The HTTP status code. A value of 200 indicates that the callback was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The callback duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Cost")
        public Integer cost;

        /**
         * <p>The details about the callback.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;MsgId\&quot;:\&quot;875d5266cbabb1834cc84a105cf68454\&quot;,\&quot;MsgTimestamp\&quot;:1697545591,\&quot;SubscribeId\&quot;:\&quot;09be0d2254cb5a89f4cbd86403ec5343\&quot;,\&quot;AppId\&quot;:\&quot;xxx\&quot;,\&quot;ChannelId\&quot;:\&quot;9099\&quot;,\&quot;Contents\&quot;:[{\&quot;Event\&quot;:\&quot;UserEvent\&quot;,\&quot;UserEvent\&quot;:{\&quot;UserId\&quot;:\&quot;linux_test\&quot;,\&quot;EventTag\&quot;:\&quot;Leave\&quot;,\&quot;SessionId\&quot;:\&quot;je7y2sBZJZQ0VBJZrh4LnBkxvGH2WyVs\&quot;,\&quot;Timestamp\&quot;:1697545591,\&quot;ChannelProfile\&quot;:\&quot;interactive_live\&quot;,\&quot;US\&quot;:5068748604047364,\&quot;Reason\&quot;:1,\&quot;Role\&quot;:1,\&quot;TerminalType\&quot;:6,\&quot;UserType\&quot;:2}}]}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The ID of the callback record.</p>
         * 
         * <strong>example:</strong>
         * <p>875d5266cbabb1834cc84a105cf6****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The subscription ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ad53276431c****</p>
         */
        @NameInMap("SubId")
        public String subId;

        /**
         * <p>The time when the callback was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-17 20:26:31.988</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://****.com/callback</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListEventSubEventResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListEventSubEventResponseBodyLogs self = new ListEventSubEventResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListEventSubEventResponseBodyLogs setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEventSubEventResponseBodyLogs setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListEventSubEventResponseBodyLogs setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public ListEventSubEventResponseBodyLogs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListEventSubEventResponseBodyLogs setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListEventSubEventResponseBodyLogs setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListEventSubEventResponseBodyLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListEventSubEventResponseBodyLogs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
