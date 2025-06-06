// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListHotlineRecordResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListHotlineRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordResponseBody self = new ListHotlineRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineRecordResponseBody setData(java.util.List<ListHotlineRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotlineRecordResponseBodyData> getData() {
        return this.data;
    }

    public ListHotlineRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotlineRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotlineRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100365558</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>100365548</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <strong>example:</strong>
         * <p>16128694810</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>16128694110</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://aliccrec-shvpc.oss-cn-shanghai.aliyuncs.com">http://aliccrec-shvpc.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListHotlineRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordResponseBodyData self = new ListHotlineRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListHotlineRecordResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public ListHotlineRecordResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListHotlineRecordResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListHotlineRecordResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
