// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSubTopicResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TopicList")
    public java.util.List<QueryDeviceSubTopicResponseBodyTopicList> topicList;

    public static QueryDeviceSubTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSubTopicResponseBody self = new QueryDeviceSubTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSubTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceSubTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceSubTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceSubTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceSubTopicResponseBody setTopicList(java.util.List<QueryDeviceSubTopicResponseBodyTopicList> topicList) {
        this.topicList = topicList;
        return this;
    }
    public java.util.List<QueryDeviceSubTopicResponseBodyTopicList> getTopicList() {
        return this.topicList;
    }

    public static class QueryDeviceSubTopicResponseBodyTopicList extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TopicName")
        public String topicName;

        public static QueryDeviceSubTopicResponseBodyTopicList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceSubTopicResponseBodyTopicList self = new QueryDeviceSubTopicResponseBodyTopicList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceSubTopicResponseBodyTopicList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryDeviceSubTopicResponseBodyTopicList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
