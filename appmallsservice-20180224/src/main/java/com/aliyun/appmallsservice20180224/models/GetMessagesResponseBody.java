// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class GetMessagesResponseBody extends TeaModel {
    @NameInMap("BizMessages")
    public java.util.List<GetMessagesResponseBodyBizMessages> bizMessages;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static GetMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessagesResponseBody self = new GetMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessagesResponseBody setBizMessages(java.util.List<GetMessagesResponseBodyBizMessages> bizMessages) {
        this.bizMessages = bizMessages;
        return this;
    }
    public java.util.List<GetMessagesResponseBodyBizMessages> getBizMessages() {
        return this.bizMessages;
    }

    public GetMessagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMessagesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public GetMessagesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessagesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public GetMessagesResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class GetMessagesResponseBodyBizMessages extends TeaModel {
        @NameInMap("ContentMapJson")
        public String contentMapJson;

        @NameInMap("DataId")
        public Long dataId;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Topic")
        public String topic;

        public static GetMessagesResponseBodyBizMessages build(java.util.Map<String, ?> map) throws Exception {
            GetMessagesResponseBodyBizMessages self = new GetMessagesResponseBodyBizMessages();
            return TeaModel.build(map, self);
        }

        public GetMessagesResponseBodyBizMessages setContentMapJson(String contentMapJson) {
            this.contentMapJson = contentMapJson;
            return this;
        }
        public String getContentMapJson() {
            return this.contentMapJson;
        }

        public GetMessagesResponseBodyBizMessages setDataId(Long dataId) {
            this.dataId = dataId;
            return this;
        }
        public Long getDataId() {
            return this.dataId;
        }

        public GetMessagesResponseBodyBizMessages setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetMessagesResponseBodyBizMessages setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
