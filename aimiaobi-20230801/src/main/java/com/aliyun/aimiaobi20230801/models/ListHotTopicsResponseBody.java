// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotTopicsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListHotTopicsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHotTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicsResponseBody self = new ListHotTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotTopicsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotTopicsResponseBody setData(java.util.List<ListHotTopicsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotTopicsResponseBodyData> getData() {
        return this.data;
    }

    public ListHotTopicsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotTopicsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotTopicsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotTopicsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotTopicsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHotTopicsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHotTopicsResponseBodyDataStructureSummaryDocList extends TeaModel {
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListHotTopicsResponseBodyDataStructureSummaryDocList build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicsResponseBodyDataStructureSummaryDocList self = new ListHotTopicsResponseBodyDataStructureSummaryDocList();
            return TeaModel.build(map, self);
        }

        public ListHotTopicsResponseBodyDataStructureSummaryDocList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHotTopicsResponseBodyDataStructureSummaryDocList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListHotTopicsResponseBodyDataStructureSummaryDocList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListHotTopicsResponseBodyDataStructureSummary extends TeaModel {
        @NameInMap("DocList")
        public java.util.List<ListHotTopicsResponseBodyDataStructureSummaryDocList> docList;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListHotTopicsResponseBodyDataStructureSummary build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicsResponseBodyDataStructureSummary self = new ListHotTopicsResponseBodyDataStructureSummary();
            return TeaModel.build(map, self);
        }

        public ListHotTopicsResponseBodyDataStructureSummary setDocList(java.util.List<ListHotTopicsResponseBodyDataStructureSummaryDocList> docList) {
            this.docList = docList;
            return this;
        }
        public java.util.List<ListHotTopicsResponseBodyDataStructureSummaryDocList> getDocList() {
            return this.docList;
        }

        public ListHotTopicsResponseBodyDataStructureSummary setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListHotTopicsResponseBodyDataStructureSummary setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListHotTopicsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>异步任务ID（自定义主题场景下使用）</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <strong>example:</strong>
         * <p>创建用户ID（自定义主题场景下使用）</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("HotValue")
        public Long hotValue;

        /**
         * <strong>example:</strong>
         * <p>热榜ID</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StructureSummary")
        public java.util.List<ListHotTopicsResponseBodyDataStructureSummary> structureSummary;

        /**
         * <strong>example:</strong>
         * <p>热榜摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>异步任务失败错误信息</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <strong>example:</strong>
         * <p>主题唯一名称</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>热榜源，目前支持的热榜源: Toutiao：头条、Quark：夸克、Baidu：百度、Sina：新浪。Custom：自定义、Aggregation：热点话题榜</p>
         */
        @NameInMap("TopicSource")
        public String topicSource;

        /**
         * <strong>example:</strong>
         * <p>数据版本</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListHotTopicsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotTopicsResponseBodyData self = new ListHotTopicsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotTopicsResponseBodyData setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public ListHotTopicsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListHotTopicsResponseBodyData setHotValue(Long hotValue) {
            this.hotValue = hotValue;
            return this;
        }
        public Long getHotValue() {
            return this.hotValue;
        }

        public ListHotTopicsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHotTopicsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHotTopicsResponseBodyData setStructureSummary(java.util.List<ListHotTopicsResponseBodyDataStructureSummary> structureSummary) {
            this.structureSummary = structureSummary;
            return this;
        }
        public java.util.List<ListHotTopicsResponseBodyDataStructureSummary> getStructureSummary() {
            return this.structureSummary;
        }

        public ListHotTopicsResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListHotTopicsResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public ListHotTopicsResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListHotTopicsResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListHotTopicsResponseBodyData setTopicSource(String topicSource) {
            this.topicSource = topicSource;
            return this;
        }
        public String getTopicSource() {
            return this.topicSource;
        }

        public ListHotTopicsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
