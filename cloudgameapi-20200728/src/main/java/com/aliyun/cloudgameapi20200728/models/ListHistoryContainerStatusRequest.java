// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListHistoryContainerStatusRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("LastGameSessionId")
    public String lastGameSessionId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    public static ListHistoryContainerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryContainerStatusRequest self = new ListHistoryContainerStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoryContainerStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListHistoryContainerStatusRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListHistoryContainerStatusRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoryContainerStatusRequest setLastGameSessionId(String lastGameSessionId) {
        this.lastGameSessionId = lastGameSessionId;
        return this;
    }
    public String getLastGameSessionId() {
        return this.lastGameSessionId;
    }

    public ListHistoryContainerStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
