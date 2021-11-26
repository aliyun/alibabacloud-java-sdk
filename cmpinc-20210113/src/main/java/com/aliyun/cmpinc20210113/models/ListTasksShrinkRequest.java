// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class ListTasksShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appNameShrink;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskType")
    public String taskType;

    public static ListTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksShrinkRequest self = new ListTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksShrinkRequest setAppNameShrink(String appNameShrink) {
        this.appNameShrink = appNameShrink;
        return this;
    }
    public String getAppNameShrink() {
        return this.appNameShrink;
    }

    public ListTasksShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTasksShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
