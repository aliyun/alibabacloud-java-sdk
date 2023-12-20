// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRtmpKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRtmpKeyResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRtmpKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRtmpKeyResponseBody self = new QueryRtmpKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRtmpKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRtmpKeyResponseBody setData(QueryRtmpKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRtmpKeyResponseBodyData getData() {
        return this.data;
    }

    public QueryRtmpKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRtmpKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRtmpKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRtmpKeyResponseBodyData extends TeaModel {
        @NameInMap("PullAuthKey")
        public String pullAuthKey;

        @NameInMap("PullKeyExpireTime")
        public Integer pullKeyExpireTime;

        @NameInMap("PushAuthKey")
        public String pushAuthKey;

        @NameInMap("PushKeyExpireTime")
        public Integer pushKeyExpireTime;

        @NameInMap("StreamName")
        public String streamName;

        public static QueryRtmpKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRtmpKeyResponseBodyData self = new QueryRtmpKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRtmpKeyResponseBodyData setPullAuthKey(String pullAuthKey) {
            this.pullAuthKey = pullAuthKey;
            return this;
        }
        public String getPullAuthKey() {
            return this.pullAuthKey;
        }

        public QueryRtmpKeyResponseBodyData setPullKeyExpireTime(Integer pullKeyExpireTime) {
            this.pullKeyExpireTime = pullKeyExpireTime;
            return this;
        }
        public Integer getPullKeyExpireTime() {
            return this.pullKeyExpireTime;
        }

        public QueryRtmpKeyResponseBodyData setPushAuthKey(String pushAuthKey) {
            this.pushAuthKey = pushAuthKey;
            return this;
        }
        public String getPushAuthKey() {
            return this.pushAuthKey;
        }

        public QueryRtmpKeyResponseBodyData setPushKeyExpireTime(Integer pushKeyExpireTime) {
            this.pushKeyExpireTime = pushKeyExpireTime;
            return this;
        }
        public Integer getPushKeyExpireTime() {
            return this.pushKeyExpireTime;
        }

        public QueryRtmpKeyResponseBodyData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
