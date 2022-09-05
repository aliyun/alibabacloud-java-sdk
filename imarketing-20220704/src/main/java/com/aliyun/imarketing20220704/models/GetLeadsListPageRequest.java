// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetLeadsListPageRequest extends TeaModel {
    @NameInMap("ComponentId")
    public Long componentId;

    @NameInMap("ContentId")
    public Long contentId;

    @NameInMap("CreativeId")
    public Long creativeId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MainId")
    public Long mainId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetLeadsListPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLeadsListPageRequest self = new GetLeadsListPageRequest();
        return TeaModel.build(map, self);
    }

    public GetLeadsListPageRequest setComponentId(Long componentId) {
        this.componentId = componentId;
        return this;
    }
    public Long getComponentId() {
        return this.componentId;
    }

    public GetLeadsListPageRequest setContentId(Long contentId) {
        this.contentId = contentId;
        return this;
    }
    public Long getContentId() {
        return this.contentId;
    }

    public GetLeadsListPageRequest setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
        return this;
    }
    public Long getCreativeId() {
        return this.creativeId;
    }

    public GetLeadsListPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetLeadsListPageRequest setMainId(Long mainId) {
        this.mainId = mainId;
        return this;
    }
    public Long getMainId() {
        return this.mainId;
    }

    public GetLeadsListPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetLeadsListPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLeadsListPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetLeadsListPageRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
