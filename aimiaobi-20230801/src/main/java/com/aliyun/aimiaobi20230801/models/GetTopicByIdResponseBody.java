// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetTopicByIdResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public GetTopicByIdResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error description</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTopicByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicByIdResponseBody self = new GetTopicByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTopicByIdResponseBody setData(GetTopicByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicByIdResponseBodyData getData() {
        return this.data;
    }

    public GetTopicByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicByIdResponseBodyDataStructureSummaryDocList extends TeaModel {
        /**
         * <p>Article source</p>
         * 
         * <strong>example:</strong>
         * <p>头条</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Article title</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Article URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetTopicByIdResponseBodyDataStructureSummaryDocList build(java.util.Map<String, ?> map) throws Exception {
            GetTopicByIdResponseBodyDataStructureSummaryDocList self = new GetTopicByIdResponseBodyDataStructureSummaryDocList();
            return TeaModel.build(map, self);
        }

        public GetTopicByIdResponseBodyDataStructureSummaryDocList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTopicByIdResponseBodyDataStructureSummaryDocList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTopicByIdResponseBodyDataStructureSummaryDocList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetTopicByIdResponseBodyDataStructureSummary extends TeaModel {
        /**
         * <p>Articles referenced to generate the title summary</p>
         */
        @NameInMap("DocList")
        public java.util.List<GetTopicByIdResponseBodyDataStructureSummaryDocList> docList;

        /**
         * <p>Summary</p>
         * 
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetTopicByIdResponseBodyDataStructureSummary build(java.util.Map<String, ?> map) throws Exception {
            GetTopicByIdResponseBodyDataStructureSummary self = new GetTopicByIdResponseBodyDataStructureSummary();
            return TeaModel.build(map, self);
        }

        public GetTopicByIdResponseBodyDataStructureSummary setDocList(java.util.List<GetTopicByIdResponseBodyDataStructureSummaryDocList> docList) {
            this.docList = docList;
            return this;
        }
        public java.util.List<GetTopicByIdResponseBodyDataStructureSummaryDocList> getDocList() {
            return this.docList;
        }

        public GetTopicByIdResponseBodyDataStructureSummary setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetTopicByIdResponseBodyDataStructureSummary setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetTopicByIdResponseBodyData extends TeaModel {
        /**
         * <p>Asynchronous task ID (used in custom topic scenarios)</p>
         * 
         * <strong>example:</strong>
         * <p>异步任务ID（自定义主题场景下使用）</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <p>Creator user ID (used in custom topic scenarios)</p>
         * 
         * <strong>example:</strong>
         * <p>创建用户ID（自定义主题场景下使用）</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Hotness value</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("HotValue")
        public Long hotValue;

        /**
         * <p>Hot topic ID</p>
         * 
         * <strong>example:</strong>
         * <p>热榜ID</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Asynchronous task status (used in custom event scenarios) (PENDING: pending, RUNNING: running, SUCCESSED: succeeded, SUSPENDED: suspended, FAILED: failed, CANCELED: canceled)</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>List of structured topic summaries</p>
         */
        @NameInMap("StructureSummary")
        public java.util.List<GetTopicByIdResponseBodyDataStructureSummary> structureSummary;

        /**
         * <p>Hot topic summary</p>
         * 
         * <strong>example:</strong>
         * <p>热榜摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Error message for asynchronous task failure</p>
         * 
         * <strong>example:</strong>
         * <p>异步任务失败错误信息</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>Asynchronous task status. 0: pending, 1: running, 2: succeeded, 3: suspended (not used), 4: failed, 6: canceled (used in custom event scenarios).</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>Unique topic name</p>
         * 
         * <strong>example:</strong>
         * <p>主题唯一名称</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>Hot topic source. Supported sources:</p>
         * <ul>
         * <li><p>Toutiao: Toutiao</p>
         * </li>
         * <li><p>Quark: Quark</p>
         * </li>
         * <li><p>Baidu: Baidu</p>
         * </li>
         * <li><p>Sina: Sina</p>
         * </li>
         * <li><p>Custom: Custom</p>
         * </li>
         * <li><p>Aggregation: Hot Topic List</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Toutiao</p>
         */
        @NameInMap("TopicSource")
        public String topicSource;

        /**
         * <p>Data version</p>
         * 
         * <strong>example:</strong>
         * <p>数据版本</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetTopicByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicByIdResponseBodyData self = new GetTopicByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicByIdResponseBodyData setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public GetTopicByIdResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetTopicByIdResponseBodyData setHotValue(Long hotValue) {
            this.hotValue = hotValue;
            return this;
        }
        public Long getHotValue() {
            return this.hotValue;
        }

        public GetTopicByIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTopicByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTopicByIdResponseBodyData setStructureSummary(java.util.List<GetTopicByIdResponseBodyDataStructureSummary> structureSummary) {
            this.structureSummary = structureSummary;
            return this;
        }
        public java.util.List<GetTopicByIdResponseBodyDataStructureSummary> getStructureSummary() {
            return this.structureSummary;
        }

        public GetTopicByIdResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetTopicByIdResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public GetTopicByIdResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public GetTopicByIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetTopicByIdResponseBodyData setTopicSource(String topicSource) {
            this.topicSource = topicSource;
            return this;
        }
        public String getTopicSource() {
            return this.topicSource;
        }

        public GetTopicByIdResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
