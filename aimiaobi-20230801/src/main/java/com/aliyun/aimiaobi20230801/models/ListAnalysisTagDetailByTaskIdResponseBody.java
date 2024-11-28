// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAnalysisTagDetailByTaskIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>token-xxxx</p>
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
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAnalysisTagDetailByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisTagDetailByTaskIdResponseBody self = new ListAnalysisTagDetailByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setData(java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyData> getData() {
        return this.data;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAnalysisTagDetailByTaskIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SummaryOverview")
        public String summaryOverview;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags build(java.util.Map<String, ?> map) throws Exception {
            ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags self = new ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags();
            return TeaModel.build(map, self);
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags setSummaryOverview(String summaryOverview) {
            this.summaryOverview = summaryOverview;
            return this;
        }
        public String getSummaryOverview() {
            return this.summaryOverview;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class ListAnalysisTagDetailByTaskIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentTags")
        public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags> contentTags;

        /**
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>summaryAndOverview</p>
         */
        @NameInMap("TagTaskType")
        public String tagTaskType;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListAnalysisTagDetailByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnalysisTagDetailByTaskIdResponseBodyData self = new ListAnalysisTagDetailByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setContentTags(java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags> contentTags) {
            this.contentTags = contentTags;
            return this;
        }
        public java.util.List<ListAnalysisTagDetailByTaskIdResponseBodyDataContentTags> getContentTags() {
            return this.contentTags;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setTagTaskType(String tagTaskType) {
            this.tagTaskType = tagTaskType;
            return this;
        }
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        public ListAnalysisTagDetailByTaskIdResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
