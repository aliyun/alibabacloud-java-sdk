// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    // maxResults本次请求所返回的最大记录条数
    @NameInMap("maxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("nextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    // totalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(java.util.List<ListTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTasksError extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static ListTasksResponseBodyTasksError build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasksError self = new ListTasksResponseBodyTasksError();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasksError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListTasksResponseBodyTasksError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("error")
        public ListTasksResponseBodyTasksError error;

        @NameInMap("productCode")
        public String productCode;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("retryAfter")
        public Integer retryAfter;

        @NameInMap("status")
        public String status;

        @NameInMap("taskAction")
        public String taskAction;

        @NameInMap("taskId")
        public String taskId;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyTasks setError(ListTasksResponseBodyTasksError error) {
            this.error = error;
            return this;
        }
        public ListTasksResponseBodyTasksError getError() {
            return this.error;
        }

        public ListTasksResponseBodyTasks setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListTasksResponseBodyTasks setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTasksResponseBodyTasks setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public ListTasksResponseBodyTasks setRetryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }
        public Integer getRetryAfter() {
            return this.retryAfter;
        }

        public ListTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTasks setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public ListTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
