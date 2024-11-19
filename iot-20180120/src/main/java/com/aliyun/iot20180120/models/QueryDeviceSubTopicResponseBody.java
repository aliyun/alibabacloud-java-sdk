// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceSubTopicResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. The ID uniquely identifies this request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about the topics to which the device has subscribed. This parameter is returned if the call was successful.</p>
     */
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
        /**
         * <p>The time when the device subscribed to a topic. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1662039965873</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The name of the topic.</p>
         */
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
