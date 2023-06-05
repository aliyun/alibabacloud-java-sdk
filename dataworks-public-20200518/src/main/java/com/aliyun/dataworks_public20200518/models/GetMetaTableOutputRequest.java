// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableOutputRequest extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The Globally Unique Identifier (GUID) of the MaxCompute metatable.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The start date of the time range to query. The start date must be within the previous 30 days.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the node.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The end date of the time range to query. The end date must be within the previous 30 days.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetMetaTableOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableOutputRequest self = new GetMetaTableOutputRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableOutputRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetMetaTableOutputRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMetaTableOutputRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMetaTableOutputRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetMetaTableOutputRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableOutputRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
