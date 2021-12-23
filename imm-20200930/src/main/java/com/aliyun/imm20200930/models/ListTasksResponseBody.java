// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    // 最大结果数量
    @NameInMap("MaxResults")
    public String maxResults;

    // 翻页标记
    @NameInMap("NextToken")
    public String nextToken;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 请求唯一Id
    @NameInMap("RequestId")
    public String requestId;

    // 任务信息
    @NameInMap("Tasks")
    public java.util.List<TaskInfo> tasks;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(java.util.List<TaskInfo> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<TaskInfo> getTasks() {
        return this.tasks;
    }

}
