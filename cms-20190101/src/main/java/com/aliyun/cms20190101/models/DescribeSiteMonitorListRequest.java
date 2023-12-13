// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListRequest extends TeaModel {
    /**
     * <p>The keyword to be matched.</p>
     * <br>
     * <p>>  You can search for tasks by name or address. Fuzzy search is supported.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the site monitoring task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task status. Valid values:</p>
     * <br>
     * <p>*   1: The task is enabled.</p>
     * <p>*   2: The task is disabled.</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <p>The protocol that is used by the site monitoring task. Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
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
