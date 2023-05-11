// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of hops for the PING protocol.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeSiteMonitorList**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The parsing path of the assertion.</p>
     * <br>
     * <p>*   If the assertion type is `body_json`, the path is `json path`.</p>
     * <p>*   If the assertion type is `body_xml`, the path is `xml path`.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The ID of the site monitoring task.</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <p>The time when the site monitoring task was updated.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeSiteMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListRequest self = new DescribeSiteMonitorListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeSiteMonitorListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeSiteMonitorListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSiteMonitorListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSiteMonitorListRequest setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public DescribeSiteMonitorListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
