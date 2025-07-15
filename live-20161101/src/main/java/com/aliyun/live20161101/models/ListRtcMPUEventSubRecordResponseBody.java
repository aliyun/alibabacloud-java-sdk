// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUEventSubRecordResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
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
    public java.util.List<ListRtcMPUEventSubRecordResponseBodyLogs> logs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRtcMPUEventSubRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRtcMPUEventSubRecordResponseBody self = new ListRtcMPUEventSubRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRtcMPUEventSubRecordResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListRtcMPUEventSubRecordResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListRtcMPUEventSubRecordResponseBody setLogs(java.util.List<ListRtcMPUEventSubRecordResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListRtcMPUEventSubRecordResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListRtcMPUEventSubRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRtcMPUEventSubRecordResponseBodyLogs extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://testcallback***.com/callback">http://testcallback***.com/callback</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The callback duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>For more information about the callback, see <a href="https://help.aliyun.com/document_detail/2804583.html">CreateRtcMPUEventSub</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EventType\&quot;:1,\&quot;MsgId\&quot;:\&quot;42bba8b5-94ab-468c-9dae-9b501dd6c***\&quot;,\&quot;AppId\&quot;:\&quot;rtcdev\&quot;,\&quot;SubId\&quot;:\&quot;Sub-9799B2C45009799B2C4***\&quot;,\&quot;TaskId\&quot;:\&quot;mpucallbacktest\&quot;,\&quot;CallbackTs\&quot;:1712656430***,\&quot;Payload\&quot;:{\&quot;DstUrl\&quot;:\&quot;rtmp://domain/app/stream?auth\&quot;,\&quot;EventTs\&quot;:1712656430***,\&quot;EventCode\&quot;:1,\&quot;ErrorCode\&quot;:0,\&quot;ErrorMessage\&quot;:\&quot;\&quot;}}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The HTTP status code. 200 indicates that the callback is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HTTPCode")
        public String HTTPCode;

        /**
         * <p>The ID of the callback record.</p>
         * 
         * <strong>example:</strong>
         * <p>42bba8b5-********-9b501dd6cb6e</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The ID of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>Sub-<strong><strong><strong>9799B2C4500</strong></strong></strong></p>
         */
        @NameInMap("SubId")
        public String subId;

        /**
         * <p>The time when the callback was invoked. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01T00:00:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static ListRtcMPUEventSubRecordResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListRtcMPUEventSubRecordResponseBodyLogs self = new ListRtcMPUEventSubRecordResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setHTTPCode(String HTTPCode) {
            this.HTTPCode = HTTPCode;
            return this;
        }
        public String getHTTPCode() {
            return this.HTTPCode;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListRtcMPUEventSubRecordResponseBodyLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
