// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelEventsCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelEventsCountResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelEventsCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelEventsCountResponseBody self = new SentinelEventsCountResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelEventsCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelEventsCountResponseBody setData(java.util.List<SentinelEventsCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelEventsCountResponseBodyData> getData() {
        return this.data;
    }

    public SentinelEventsCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelEventsCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelEventsCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelEventsCountResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("time")
        public String time;

        @NameInMap("userId")
        public String userId;

        public static SentinelEventsCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelEventsCountResponseBodyData self = new SentinelEventsCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelEventsCountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SentinelEventsCountResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelEventsCountResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public SentinelEventsCountResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
