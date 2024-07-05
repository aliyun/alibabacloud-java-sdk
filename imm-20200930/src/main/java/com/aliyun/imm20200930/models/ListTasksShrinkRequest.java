// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListTasksShrinkRequest extends TeaModel {
    @NameInMap("EndTimeRange")
    public String endTimeRangeShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("RequestDefinition")
    public Boolean requestDefinition;

    /**
     * <strong>example:</strong>
     * <p>TaskId</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("StartTimeRange")
    public String startTimeRangeShrink;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>test=val1</p>
     */
    @NameInMap("TagSelector")
    public String tagSelector;

    @NameInMap("TaskTypes")
    public String taskTypesShrink;

    public static ListTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksShrinkRequest self = new ListTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksShrinkRequest setEndTimeRangeShrink(String endTimeRangeShrink) {
        this.endTimeRangeShrink = endTimeRangeShrink;
        return this;
    }
    public String getEndTimeRangeShrink() {
        return this.endTimeRangeShrink;
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

    public ListTasksShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTasksShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListTasksShrinkRequest setRequestDefinition(Boolean requestDefinition) {
        this.requestDefinition = requestDefinition;
        return this;
    }
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    public ListTasksShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListTasksShrinkRequest setStartTimeRangeShrink(String startTimeRangeShrink) {
        this.startTimeRangeShrink = startTimeRangeShrink;
        return this;
    }
    public String getStartTimeRangeShrink() {
        return this.startTimeRangeShrink;
    }

    public ListTasksShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksShrinkRequest setTagSelector(String tagSelector) {
        this.tagSelector = tagSelector;
        return this;
    }
    public String getTagSelector() {
        return this.tagSelector;
    }

    public ListTasksShrinkRequest setTaskTypesShrink(String taskTypesShrink) {
        this.taskTypesShrink = taskTypesShrink;
        return this;
    }
    public String getTaskTypesShrink() {
        return this.taskTypesShrink;
    }

}
