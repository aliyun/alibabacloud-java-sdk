// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSiteMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListRequest self = new DescribeSiteMonitorListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSiteMonitorListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
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

}
