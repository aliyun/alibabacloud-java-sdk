// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskListRequest extends TeaModel {
    /**
     * <p>The order by which the queried tasks are sorted. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: ascending</li>
     * <li><strong>desc</strong>: descending</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The condition by which the queried tasks are sorted.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. Default value: <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>net-test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The task is stopped.</li>
     * <li><strong>1</strong>: The task is started.</li>
     * <li><strong>9</strong>: The task is ended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ol>
     * <li>3: web page performance - IE</li>
     * <li>34: web page performance - Chrome</li>
     * <li>0: network quality</li>
     * <li>40: file download</li>
     * <li>7: API performance</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The URL for synthetic monitoring.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GetSyntheticTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskListRequest self = new GetSyntheticTaskListRequest();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskListRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetSyntheticTaskListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetSyntheticTaskListRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public GetSyntheticTaskListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetSyntheticTaskListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSyntheticTaskListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetSyntheticTaskListRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetSyntheticTaskListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetSyntheticTaskListRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
