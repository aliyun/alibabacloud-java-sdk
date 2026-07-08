// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListCustomViewPointsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCustomViewPointsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code>: The request was successful. \<code>false\\</code>: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomViewPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomViewPointsResponseBody self = new ListCustomViewPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomViewPointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomViewPointsResponseBody setData(java.util.List<ListCustomViewPointsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCustomViewPointsResponseBodyData> getData() {
        return this.data;
    }

    public ListCustomViewPointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCustomViewPointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomViewPointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomViewPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomViewPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomViewPointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCustomViewPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomViewPointsResponseBodyDataViewPointsOutlines extends TeaModel {
        /**
         * <p>The outline.</p>
         * 
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <p>The summary of the outline.</p>
         * 
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListCustomViewPointsResponseBodyDataViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListCustomViewPointsResponseBodyDataViewPointsOutlines self = new ListCustomViewPointsResponseBodyDataViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public ListCustomViewPointsResponseBodyDataViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public ListCustomViewPointsResponseBodyDataViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListCustomViewPointsResponseBodyDataViewPoints extends TeaModel {
        /**
         * <p>The outline.</p>
         */
        @NameInMap("Outlines")
        public java.util.List<ListCustomViewPointsResponseBodyDataViewPointsOutlines> outlines;

        /**
         * <p>The generated viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <p>The summary.</p>
         * 
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListCustomViewPointsResponseBodyDataViewPoints build(java.util.Map<String, ?> map) throws Exception {
            ListCustomViewPointsResponseBodyDataViewPoints self = new ListCustomViewPointsResponseBodyDataViewPoints();
            return TeaModel.build(map, self);
        }

        public ListCustomViewPointsResponseBodyDataViewPoints setOutlines(java.util.List<ListCustomViewPointsResponseBodyDataViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<ListCustomViewPointsResponseBodyDataViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public ListCustomViewPointsResponseBodyDataViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public ListCustomViewPointsResponseBodyDataViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListCustomViewPointsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task that analyzes the custom viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>2323ac73e174428a98c91097a59c67e0</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <p>The viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <p>The time when the viewpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-15 16:18:59</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the custom viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>709806dd051042d5ab9de8bdbb3a64ca</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The task execution status. Valid values: PENDING, RUNNING, SUCCEEDED, SUSPENDED, FAILED, and CANCELED.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The error message for the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>参数校验失败</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>The task execution status. 0: PENDING, 1: RUNNING, 2: SUCCEEDED, 3: PAUSED, 4: FAILED (retriable), 5: FAILED (non-retriable), 6: CANCELED.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>A list of topic selection viewpoints.</p>
         */
        @NameInMap("ViewPoints")
        public java.util.List<ListCustomViewPointsResponseBodyDataViewPoints> viewPoints;

        public static ListCustomViewPointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomViewPointsResponseBodyData self = new ListCustomViewPointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomViewPointsResponseBodyData setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public ListCustomViewPointsResponseBodyData setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public ListCustomViewPointsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCustomViewPointsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListCustomViewPointsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCustomViewPointsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomViewPointsResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public ListCustomViewPointsResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListCustomViewPointsResponseBodyData setViewPoints(java.util.List<ListCustomViewPointsResponseBodyDataViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<ListCustomViewPointsResponseBodyDataViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

}
