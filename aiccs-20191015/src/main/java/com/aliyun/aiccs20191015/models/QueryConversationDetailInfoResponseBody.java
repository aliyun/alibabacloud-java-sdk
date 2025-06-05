// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryConversationDetailInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F2051E18-FF3F-5C08-8D24-6F150D2AF757</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryConversationDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoResponseBody self = new QueryConversationDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryConversationDetailInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConversationDetailInfoResponseBody setData(QueryConversationDetailInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConversationDetailInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryConversationDetailInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConversationDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConversationDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConversationDetailInfoResponseBodyDataOutputTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d7f3e92b-7947-4c20-bf37-ef66fc71007b</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OutputTagDescription")
        public String outputTagDescription;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OutputTagName")
        public String outputTagName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OutputTagValue")
        public String outputTagValue;

        public static QueryConversationDetailInfoResponseBodyDataOutputTags build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoResponseBodyDataOutputTags self = new QueryConversationDetailInfoResponseBodyDataOutputTags();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setOutputTagDescription(String outputTagDescription) {
            this.outputTagDescription = outputTagDescription;
            return this;
        }
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setOutputTagName(String outputTagName) {
            this.outputTagName = outputTagName;
            return this;
        }
        public String getOutputTagName() {
            return this.outputTagName;
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setOutputTagValue(String outputTagValue) {
            this.outputTagValue = outputTagValue;
            return this;
        }
        public String getOutputTagValue() {
            return this.outputTagValue;
        }

    }

    public static class QueryConversationDetailInfoResponseBodyDataVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryConversationDetailInfoResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoResponseBodyDataVariables self = new QueryConversationDetailInfoResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryConversationDetailInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        @NameInMap("OutputTags")
        public java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> outputTags;

        /**
         * <strong>example:</strong>
         * <p>1212131231231</p>
         */
        @NameInMap("PickUpTime")
        public Long pickUpTime;

        /**
         * <strong>example:</strong>
         * <p>https://********</p>
         */
        @NameInMap("RecordingFileDownloadUrl")
        public String recordingFileDownloadUrl;

        @NameInMap("Variables")
        public java.util.List<QueryConversationDetailInfoResponseBodyDataVariables> variables;

        public static QueryConversationDetailInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoResponseBodyData self = new QueryConversationDetailInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoResponseBodyData setConversationRecord(String conversationRecord) {
            this.conversationRecord = conversationRecord;
            return this;
        }
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        public QueryConversationDetailInfoResponseBodyData setOutputTags(java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> outputTags) {
            this.outputTags = outputTags;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> getOutputTags() {
            return this.outputTags;
        }

        public QueryConversationDetailInfoResponseBodyData setPickUpTime(Long pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public Long getPickUpTime() {
            return this.pickUpTime;
        }

        public QueryConversationDetailInfoResponseBodyData setRecordingFileDownloadUrl(String recordingFileDownloadUrl) {
            this.recordingFileDownloadUrl = recordingFileDownloadUrl;
            return this;
        }
        public String getRecordingFileDownloadUrl() {
            return this.recordingFileDownloadUrl;
        }

        public QueryConversationDetailInfoResponseBodyData setVariables(java.util.List<QueryConversationDetailInfoResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

    }

}
