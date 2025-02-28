// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestTasksResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service test tasks.</p>
     */
    @NameInMap("ServiceTestTasks")
    public java.util.List<ListServiceTestTasksResponseBodyServiceTestTasks> serviceTestTasks;

    public static ListServiceTestTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestTasksResponseBody self = new ListServiceTestTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceTestTasksResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListServiceTestTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTestTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTestTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceTestTasksResponseBody setServiceTestTasks(java.util.List<ListServiceTestTasksResponseBodyServiceTestTasks> serviceTestTasks) {
        this.serviceTestTasks = serviceTestTasks;
        return this;
    }
    public java.util.List<ListServiceTestTasksResponseBodyServiceTestTasks> getServiceTestTasks() {
        return this.serviceTestTasks;
    }

    public static class ListServiceTestTasksResponseBodyServiceTestTasks extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-26T02:16:35Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>the status of service task.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sttt-000h5nd4yrg59ucurzy1</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>dadadad</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task region id.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("TaskRegionId")
        public String taskRegionId;

        public static ListServiceTestTasksResponseBodyServiceTestTasks build(java.util.Map<String, ?> map) throws Exception {
            ListServiceTestTasksResponseBodyServiceTestTasks self = new ListServiceTestTasksResponseBodyServiceTestTasks();
            return TeaModel.build(map, self);
        }

        public ListServiceTestTasksResponseBodyServiceTestTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceTestTasksResponseBodyServiceTestTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceTestTasksResponseBodyServiceTestTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListServiceTestTasksResponseBodyServiceTestTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListServiceTestTasksResponseBodyServiceTestTasks setTaskRegionId(String taskRegionId) {
            this.taskRegionId = taskRegionId;
            return this;
        }
        public String getTaskRegionId() {
            return this.taskRegionId;
        }

    }

}
